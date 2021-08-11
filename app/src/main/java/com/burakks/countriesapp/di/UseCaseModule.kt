package com.burakks.countriesapp.di

import com.burakks.countriesapp.data.cache.dao.CountryDao
import com.burakks.countriesapp.data.cache.model.CountryEntityMapper
import com.burakks.countriesapp.data.remote.model.CountryDtoMapper
import com.burakks.countriesapp.data.remote.service.CountryService
import com.burakks.countriesapp.domain.usecases.country_list.FetchCountriesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelScoped::class)
object UseCaseModule {

    @ViewModelScoped
    @Provides
    fun provideFetchCountriesUseCase(
        countryDao: CountryDao,
        countryService: CountryService,
        entityMapper: CountryEntityMapper,
        dtoMapper: CountryDtoMapper
    ): FetchCountriesUseCase {
        return FetchCountriesUseCase(
            countryDao = countryDao,
            countryService = countryService,
            entityMapper = entityMapper,
            dtoMapper = dtoMapper
        )
    }
}