package com.project.moodfood.network.models

import com.project.moodfood.domain.models.RecipeModel
import com.project.moodfood.domain.models.util.DomainMapper

class RecipeDtoMapper : DomainMapper<RecipeDto, RecipeModel> {
    override fun mapToDomainModel(model: RecipeDto): RecipeModel {
        return RecipeModel(
            id = model.pk,
            title = model.title,
            publisher = model.publisher,
            featuredImage = model.featuredImage,
            rating = model.rating,
            sourceUrl = model.sourceUrl,
            description = model.description,
            cookingInstructions = model.cookingInstructions,
            ingredients = model.ingredients?:listOf(),
            dateAdded = model.dateAdded,
            dateUpdated = model.dateUpdated
        )
    }

    override fun mapFromDomainModel(domainModel: RecipeModel): RecipeDto {
        return RecipeDto(
            pk = domainModel.id,
            title = domainModel.title,
            publisher = domainModel.publisher,
            featuredImage = domainModel.featuredImage,
            rating = domainModel.rating,
            sourceUrl = domainModel.sourceUrl,
            description = domainModel.description,
            cookingInstructions = domainModel.cookingInstructions,
            ingredients = domainModel.ingredients,
            dateAdded = domainModel.dateAdded,
            dateUpdated = domainModel.dateUpdated
        )
    }

    //functions to convert list of entities to list of recipes and vice versa

    fun fromEntityList(initial: List<RecipeDto>) : List<RecipeModel> {
        return initial.map { mapToDomainModel(it) }  //loop through each element in List of recipe_network_entity and
                                                //convert to List of recipe using function above
    }

    fun fromRecipeList(initial: List<RecipeModel>) : List<RecipeDto> {
        return initial.map { mapFromDomainModel(it) }
    }
}