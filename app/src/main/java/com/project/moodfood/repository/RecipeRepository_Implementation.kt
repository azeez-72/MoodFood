package com.project.moodfood.repository

import com.project.moodfood.domain.models.Recipe
import com.project.moodfood.network.RecipeRetrofitService
import com.project.moodfood.network.models.RecipeDto
import com.project.moodfood.network.models.RecipeDtoMapper

class RecipeRepository_Implementation(
    val recipeService : RecipeRetrofitService,
    val mapper : RecipeDtoMapper
) : RecipeRepository {
    override suspend fun search(token: String, page: Int, query: String): List<Recipe> {
        val result : List<RecipeDto> = recipeService.search(token, page, query).recipes

        return mapper.ToDomainList(result)
    }

    override suspend fun get(token: String, id: Int): Recipe {
        val result : RecipeDto = recipeService.get(token, id)

        return mapper.mapToDomainModel(result)
    }

}