package com.valorant.apiresponse.weapons

data class WeaponApiResponse(
    val uuid: String,
    val displayName: String,
    val category: String,
    val defaultSkinUuid: String,
    val displayIcon: String?,
    val killStreamIcon: String?,
    val assetPath: String,
    val weaponStats: WeaponStatsApiResponse?,
    val shopData: ShopDataApiResponse?,
    val skins: List<WeaponSkinsApiResponse>
)