package com.valorant.apiresponse.weapons

data class WeaponSkinLevelApiResponse(
    val uuid: String,
    val displayName: String,
    val levelItem: String?,
    val displayIcon: String?,
    val streamedVideo: String?,
    val assetPath: String
)