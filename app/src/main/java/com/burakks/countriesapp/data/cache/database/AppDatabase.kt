package com.burakks.countriesapp.data.cache.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.burakks.countriesapp.data.cache.dao.CountryDao
import com.burakks.countriesapp.data.cache.model.CountryEntity

@Database(
    entities = [CountryEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun countryDao(): CountryDao

    companion object {
        const val DATABASE_NAME: String = "country_db"
    }
}

