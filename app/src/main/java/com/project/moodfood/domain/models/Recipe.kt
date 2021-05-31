package com.project.moodfood.domain.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Recipe(
    val id: Int?,
    val title: String?,
    val publisher: String?,
    val featuredImage: String?,
    val rating: Int?,
    val sourceUrl: String?,
    val description: String?,
    val cookingInstructions: String?,
    val ingredients: List<String> = listOf(),
    val dateAdded: String?,
    val dateUpdated: String?,
) : Parcelable
