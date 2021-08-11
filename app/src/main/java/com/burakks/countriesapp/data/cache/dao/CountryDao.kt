package com.burakks.countriesapp.data.cache.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.burakks.countriesapp.data.cache.model.CountryEntity

@Dao
interface CountryDao {
    @Insert
    suspend fun insertCountry(country: CountryEntity): Long

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertCountries(countries: List<CountryEntity>): LongArray

    @Query("SELECT * FROM countries WHERE id = :id")
    suspend fun getCountryById(id: Int): CountryEntity?

    @Query("DELETE FROM countries WHERE id IN (:ids)")
    suspend fun deleteCountries(ids: List<Int>): Int

    @Query("DELETE FROM countries")
    suspend fun deleteAllCountries()

    @Query("DELETE FROM countries WHERE id = :pk")
    suspend fun deleteCountry(pk: Int): Int

    @Query(
        """
        SELECT * FROM countries 
        ORDER BY name DESC """
    )
    suspend fun getAllCountries(
    ): List<CountryEntity>
}