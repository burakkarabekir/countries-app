package com.burakks.countriesapp.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.burakks.countriesapp.domain.model.Country
import com.burakks.countriesapp.ui.theme.SpaceSmall
import com.burakks.countriesapp.util.DEFAULT_COUNTRY_IMAGE
import com.burakks.countriesapp.util.loadImage
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@Composable
fun CountryCard(
    country: Country,
    onClick: () -> Unit,
) {
    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier.fillMaxSize()
    ) {
        Column() {
            Card(
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .padding(
                        start = SpaceSmall,
                        top = SpaceSmall,
                    )
                    .clickable(onClick = onClick),
                elevation = 8.dp,
            ) {
                if (country.flag != null) {
                    val image = loadImage(url = country.flag, defaultImage = DEFAULT_COUNTRY_IMAGE).value
                    image?.let { img ->
                        Image(
                            bitmap = img.asImageBitmap(),
                            contentDescription = "Country Image",
                            contentScale = ContentScale.Crop,
                        )
                    }
                }
            }
            Text(
                text = country.name ?: "EMPTY STRING",
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(12.dp)
                    .wrapContentWidth(CenterHorizontally),
                style = MaterialTheme.typography.caption
            )
        }
    }
}