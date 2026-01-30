package com.valorant.entity.weapons

data class ShopDataEntity(
    val cost: Int,
    val category: String,
    val shopOrderPriority: Int,
    val categoryText: String,
    val gridPosition: GridPositionEntity?,
    val canBeTrashed: Boolean,
    val image: String?,
    val newImage: String?,
    val newImage2: String?,
    val assetPath: String
)