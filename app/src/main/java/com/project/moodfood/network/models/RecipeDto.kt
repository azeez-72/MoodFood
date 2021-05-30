package com.project.moodfood.network.models

import com.google.gson.annotations.SerializedName

data class RecipeDto (
    @SerializedName("cooking_instructions")
    var cookingInstructions: String?,
    @SerializedName("date_added")
    var dateAdded: String?,
    @SerializedName("date_updated")
    var dateUpdated: String?,
    @SerializedName("description")
    var description: String?,
    @SerializedName("featured_image")
    var featuredImage: String?,
    @SerializedName("ingredients")
    var ingredients: List<String>?,
    @SerializedName("pk")
    var pk: Int?,
    @SerializedName("publisher")
    var publisher: String?,
    @SerializedName("rating")
    var rating: Int?,
    @SerializedName("source_url")
    var sourceUrl: String?,
    @SerializedName("title")
    var title: String?
)