package com.burakks.countriesapp.presentation.navigation

sealed class Screen(val route: String) {
    object CountryList : Screen("country_list_screen")
}