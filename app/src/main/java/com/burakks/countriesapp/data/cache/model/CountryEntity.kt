package com.burakks.countriesapp.data.cache.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.burakks.countriesapp.data.remote.response.Currency
import com.burakks.countriesapp.data.remote.response.Language

@Entity(tableName = "countries")
data class CountryEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0,

    @ColumnInfo(name = "alpha2Code")
    val alpha2Code: String,
    @ColumnInfo(name = "alpha3Code")
    val alpha3Code: String,

    @ColumnInfo(name = "area")
    val area: Double,

    @ColumnInfo(name = "capital")
    val capital: String,
    @ColumnInfo(name = "cioc")
    val cioc: String,
    @ColumnInfo(name = "demonym")
    val demonym: String,
    @ColumnInfo(name = "flag")
    val flag: String,
    @ColumnInfo(name = "gini")
    val gini: Double,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "nativeName")
    val nativeName: String,
    @ColumnInfo(name = "numericCode")
    val numericCode: String,
    @ColumnInfo(name = "population")
    val population: Int,
    @ColumnInfo(name = "region")
    val region: String,
    @ColumnInfo(name = "subregion")
    val subregion: String,
)