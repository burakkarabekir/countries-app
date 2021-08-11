package com.burakks.countriesapp.data.remote.service

import com.burakks.countriesapp.data.remote.model.CountryDto
import retrofit2.http.GET

interface CountryService {

    @GET(ALL)
    suspend fun fetchCountries(): List<CountryDto>

    companion object {
        const val ALL = "all"
    }
}
