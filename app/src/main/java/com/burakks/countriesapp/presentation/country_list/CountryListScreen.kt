package com.burakks.countriesapp.presentation.country_list

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.navigation.NavHostController
import com.burakks.countriesapp.presentation.components.CountriesList
import com.burakks.countriesapp.ui.theme.AppTheme
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalMaterialApi
@ExperimentalFoundationApi
@ExperimentalCoroutinesApi
@Composable
fun CountryListScreen(
    navController: NavHostController,
    viewModel: CountryListViewModel = hiltViewModel(),
) {
    val countries = viewModel.countries.value

    val scaffoldState = rememberScaffoldState()

    AppTheme(
        scaffoldState = scaffoldState,
    ) {
        Scaffold(
            scaffoldState = scaffoldState,
            snackbarHost = {
                scaffoldState.snackbarHostState
            },
        ) {
            CountriesList(
                countries = countries
            )
        }
    }
}