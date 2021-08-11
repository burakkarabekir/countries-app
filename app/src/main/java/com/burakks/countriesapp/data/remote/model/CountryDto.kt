package com.burakks.countriesapp.data.remote.model

import com.burakks.countriesapp.data.remote.response.Currency
import com.burakks.countriesapp.data.remote.response.Language
import com.google.gson.annotations.SerializedName

data class CountryDto(
    @SerializedName("alpha2Code")
    val alpha2Code: String,
    @SerializedName("alpha3Code")
    val alpha3Code: String,
    @SerializedName("area")
    val area: Double,
    @SerializedName("capital")
    val capital: String,
    @SerializedName("cioc")
    val cioc: String,
    @SerializedName("demonym")
    val demonym: String,
    @SerializedName("flag")
    val flag: String,
    @SerializedName("gini")
    val gini: Double,
    @SerializedName("name")
    val name: String,
    @SerializedName("nativeName")
    val nativeName: String,
    @SerializedName("numericCode")
    val numericCode: String,
    @SerializedName("population")
    val population: Int,
    @SerializedName("region")
    val region: String,
    @SerializedName("subregion")
    val subregion: String,


)