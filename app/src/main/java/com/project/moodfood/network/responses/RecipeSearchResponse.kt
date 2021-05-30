package com.project.moodfood.network.responses


import com.google.gson.annotations.SerializedName
import com.project.moodfood.network.models.RecipeDto

data class RecipeSearchResponse(
    @SerializedName("count")
    var count: Int,
    @SerializedName("results")
    var recipes: List<RecipeDto>,
    @SerializedName("next")
    var next: String,
    @SerializedName("previous")
    var previous: String
)