package com.project.moodfood.repository

import com.project.moodfood.domain.models.Recipe

interface RecipeRepository {
    suspend fun search(token: String, page: Int, query: String) : List<Recipe>

    suspend fun get(token: String, id: Int) : Recipe
}