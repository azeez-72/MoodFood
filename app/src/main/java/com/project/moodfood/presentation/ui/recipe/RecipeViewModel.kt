package com.project.moodfood.presentation.ui.recipe

import androidx.lifecycle.ViewModel
import com.project.moodfood.repository.RecipeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class RecipeViewModel
@Inject
constructor(
    private val repository: RecipeRepository,
    @Named("auth_token") private val token: String,
): ViewModel(){


}