package com.burakks.countriesapp.domain.usecases.country_list

import com.burakks.countriesapp.data.cache.dao.CountryDao
import com.burakks.countriesapp.data.cache.model.CountryEntityMapper
import com.burakks.countriesapp.data.remote.model.CountryDtoMapper
import com.burakks.countriesapp.data.remote.service.CountryService
import com.burakks.countriesapp.domain.model.Country
import com.burakks.countriesapp.domain.util.DataState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class FetchCountriesUseCase(
private val countryDao: CountryDao,
private val countryService: CountryService,
private val entityMapper: CountryEntityMapper,
private val dtoMapper: CountryDtoMapper
)   {
fun execute(
    isNetworkAvailable: Boolean,
): Flow<DataState<List<Country>>> = flow {
    try {
        emit(DataState.loading())

        if (isNetworkAvailable) {
            val heroes = fetchHeroes()
            countryDao.insertCountries(entityMapper.toEntityList(heroes))
        }

        // query the cache
        val cacheResult = countryDao.getAllCountries()

        // emit List<Hero> from cache
        val list = entityMapper.fromEntityList(cacheResult)

        emit(DataState.success(list))
    } catch (e: Exception) {
        emit(DataState.error<List<Country>>(e.message ?: "Unknown Error"))
    }
}

// WARNING: This will throw exception if there is no network connection
private suspend fun fetchHeroes(
): List<Country> {
    return dtoMapper.toDomainList(
        countryService.fetchCountries()
    )
}
}