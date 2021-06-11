package com.project.moodfood.presentation.ui.recipe_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import com.google.accompanist.glide.rememberGlidePainter
import com.google.accompanist.imageloading.ImageLoadState
import com.project.moodfood.R

//import com.google.accompanist.glide.rememberGlidePainter

class RecipeListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {

                val painter = rememberGlidePainter(
                    "https://assets.materialup.com/uploads/b03b23aa-aa69-4657-aa5e-fa5fef2c76e8/preview.png",
                    fadeIn = true
                )

                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = "Hi there")

                    Box {
                        Image(
                            painter = painter,
                            contentDescription = "Image of the food"
                        )

                        when(painter.loadState) {
                            is ImageLoadState.Loading -> {
                                CircularProgressIndicator(Modifier.align(Alignment.Center))
                            }
                            is ImageLoadState.Error -> {
                                Image(
                                    painter = painterResource(id = R.drawable.foodplaceholder),
                                    contentDescription = "Error Image",
                                    modifier = Modifier
                                        .height(180.dp)
                                        .fillMaxWidth(),
                                    contentScale = ContentScale.Crop
                                )
                            }
                            else -> Text(text = "Error!")
                        }
                    }
                }
            }
        }
    }
}