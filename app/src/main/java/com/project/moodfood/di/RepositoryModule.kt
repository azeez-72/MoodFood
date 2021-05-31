package com.project.moodfood.di

import com.project.moodfood.network.RecipeRetrofitService
import com.project.moodfood.network.models.RecipeDtoMapper
import com.project.moodfood.repository.RecipeRepository
import com.project.moodfood.repository.RecipeRepository_Implementation
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRecipeRepository(
        recipeService: RecipeRetrofitService,
        recipeMapper: RecipeDtoMapper,
    ): RecipeRepository {
        return RecipeRepository_Implementation(
            recipeService = recipeService,
            mapper = recipeMapper
        )
    }
}