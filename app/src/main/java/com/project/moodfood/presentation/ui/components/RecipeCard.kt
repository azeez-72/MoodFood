package com.project.moodfood.presentation.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.glide.rememberGlidePainter
import com.project.moodfood.R
import com.project.moodfood.domain.models.Recipe
import kotlinx.coroutines.ExperimentalCoroutinesApi

@Composable
@Preview
fun ShowText() {
    Text("Hello")
}

@ExperimentalCoroutinesApi
@Composable
fun RecipeCard(
    recipe: Recipe,
    onClick: () -> Unit,
){
    Card(
        shape = MaterialTheme.shapes.small,
        modifier = Modifier
            .padding(
                start = 8.dp,
                end = 8.dp,
                bottom = 6.dp,
                top = 6.dp,
            )
            .fillMaxWidth()
            .clickable(onClick = onClick),
        elevation = 8.dp,
    ) {

        Column() {
            recipe.featuredImage?.let { url->
                Image(
                    painter = rememberGlidePainter(
                        url,
                        previewPlaceholder = R.drawable.foodplaceholder,
                        fadeIn = true
                    ),
                    contentDescription = "Food",
                    modifier = Modifier.height(200.dp).fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
            }
            recipe.title?.let { title ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top=12.dp, bottom=12.dp, start = 8.dp, end=8.dp)
                ){
                    Text(
                        text = title,
                        maxLines = 1,
                        modifier = Modifier
                            .fillMaxWidth(0.85f)
                            .wrapContentWidth(Alignment.Start)
                        ,
                        style = MaterialTheme.typography.h6
                    )
                    val rank = recipe.rating.toString()
                    Text(
                        text = rank,
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(Alignment.End)
                            .align(Alignment.CenterVertically)
                        ,
                        style = MaterialTheme.typography.h6
                    )
                }
            }
        }
    }
}