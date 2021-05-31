package com.project.moodfood.presentation.ui.recipe_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment

class RecipeListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = "Hi there")
//                    Text_heading()
//                    Text_heading()
//                    Text_heading()
                }
            }
        }
    }
}

//@Composable
//fun Text_heading() {
//    Text(
//        text = "Hi this is a list fragment",
//        style = TextStyle(
//            fontSize = 21.sp
//        )
//    )
//}