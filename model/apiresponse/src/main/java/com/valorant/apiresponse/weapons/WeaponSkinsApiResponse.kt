package com.valorant.apiresponse.weapons

data class WeaponSkinsApiResponse(
    val uuid: String,
    val displayName: String,
    val themeUuid: String,
    val contentTierUuid: String?,
    val displayIcon: String?,
    val wallpaper: String?,
    val assetPath: String,
    val chromas: List<WeaponSkinChromaApiResponse>,
    val levels: List<WeaponSkinLevelApiResponse>
)