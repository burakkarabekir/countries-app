package com.burakks.countriesapp.di


import android.content.Context
import androidx.room.Room
import com.burakks.countriesapp.data.cache.dao.CountryDao
import com.burakks.countriesapp.data.cache.database.AppDatabase
import com.burakks.countriesapp.data.cache.model.CountryEntityMapper
import com.burakks.countriesapp.presentation.BaseApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CacheModule {

    @Singleton
    @Provides
    fun provideDatabase(app: BaseApplication): AppDatabase {
        return Room.databaseBuilder(app, AppDatabase::class.java, AppDatabase.DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideCountryDao(db: AppDatabase): CountryDao {
        return  db.countryDao()
    }

    @Singleton
    @Provides
    fun provideCacheCountryMapper(): CountryEntityMapper {
        return CountryEntityMapper()
    }
}