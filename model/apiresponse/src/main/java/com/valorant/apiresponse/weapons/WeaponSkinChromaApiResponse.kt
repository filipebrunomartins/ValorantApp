package com.valorant.apiresponse.weapons

data class WeaponSkinChromaApiResponse(
    val uuid: String,
    val displayName: String,
    val displayIcon: String?,
    val fullRender: String?,
    val swatch: String?,
    val streamedVideo: String?,
    val assetPath: String
)