package com.burakks.countriesapp.presentation.country_list

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.burakks.countriesapp.domain.model.Country
import com.burakks.countriesapp.domain.usecases.country_list.FetchCountriesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import timber.log.Timber.e
import javax.inject.Inject

@HiltViewModel
class CountryListViewModel @Inject constructor(
    private val useCase: FetchCountriesUseCase,
) : ViewModel() {
    val countries: MutableState<List<Country>> = mutableStateOf(listOf())

    init {
        listCountries()
    }

    private fun listCountries() {
        useCase.execute(
            true
        ).onEach { dataState ->
            dataState.data?.let { list ->
                countries.value = list
            }

            dataState.error?.let { error ->
                e("GET ALL COUNTRIES :: $error")
            }
        }.launchIn(viewModelScope)
    }
}