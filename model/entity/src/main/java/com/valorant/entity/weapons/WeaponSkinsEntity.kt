package com.valorant.entity.weapons

data class WeaponSkinsEntity(
    val uuid: String,
    val displayName: String,
    val themeUuid: String,
    val contentTierUuid: String?,
    val displayIcon: String?,
    val wallpaper: String?,
    val assetPath: String,
    val chromas: List<WeaponSkinChromaEntity>,
    val levels: List<WeaponSkinLevelEntity>
)