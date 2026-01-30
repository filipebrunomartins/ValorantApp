package com.valorant.entity.weapons

data class WeaponSkinLevelEntity(
    val uuid: String,
    val displayName: String,
    val levelItem: String?,
    val displayIcon: String?,
    val streamedVideo: String?,
    val assetPath: String
)