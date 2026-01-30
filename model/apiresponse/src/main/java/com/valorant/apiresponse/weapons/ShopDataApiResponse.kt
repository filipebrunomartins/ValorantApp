package com.valorant.apiresponse.weapons

data class ShopDataApiResponse(
    val cost: Int,
    val category: String,
    val shopOrderPriority: Int,
    val categoryText: String,
    val gridPosition: GridPositionApiResponse?,
    val canBeTrashed: Boolean,
    val image: String?,
    val newImage: String?,
    val newImage2: String?,
    val assetPath: String
)
