package com.burakks.countriesapp.domain.model

import com.burakks.countriesapp.data.remote.response.Currency
import com.burakks.countriesapp.data.remote.response.Language

data class Country(
    val alpha2Code: String,
    val alpha3Code: String,
    val altSpellings: List<String>,
    val area: Double,
    val borders: List<String>,
    val callingCodes: List<String>,
    val capital: String,
    val cioc: String,
    val currencies: List<Currency>,
    val demonym: String,
    val flag: String,
    val gini: Double,
    val languages: List<Language>,
    val latlng: List<Int>,
    val name: String,
    val nativeName: String,
    val numericCode: String,
    val population: Int,
    val region: String,
    val subregion: String,
    val timezones: List<String>,
    val topLevelDomain: List<String>,

    )