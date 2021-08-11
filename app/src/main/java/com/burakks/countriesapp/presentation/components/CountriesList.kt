package com.burakks.countriesapp.presentation.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.burakks.countriesapp.domain.model.Country
import kotlinx.coroutines.ExperimentalCoroutinesApi

const val IMAGE_HEIGHT = 150

@ExperimentalFoundationApi
@ExperimentalCoroutinesApi
@Composable
fun CountriesList(
    countries: List<Country>,
) {
    Box(
        modifier = Modifier
            .padding(24.dp)
    ) {
        LazyVerticalGrid(
            cells = GridCells.Adaptive(IMAGE_HEIGHT.dp)
        ) {
            itemsIndexed(
                items = countries
            ) { _, country ->
                CountryCard(
                    country = country,
                    onClick = { }
                )
            }
        }
    }
}