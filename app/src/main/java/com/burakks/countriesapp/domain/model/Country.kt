package com.burakks.countriesapp.domain.model

data class Country(
    val alpha2Code: String,
    val alpha3Code: String,
    val area: Double,
    val capital: String? = null,
    val cioc: String? = null,
    val demonym: String,
    val flag: String? = null,
    val gini: Double,
    val name: String? = null,
    val nativeName: String? = null,
    val numericCode: String? = null,
    val population: Int,
    val region: String? = null,
    val subregion: String? = null,
    )