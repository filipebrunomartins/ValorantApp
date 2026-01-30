package com.valorant.entity.weapons

data class WeaponEntity(
    val uuid: String,
    val displayName: String,
    val category: String,
    val defaultSkinUuid: String,
    val displayIcon: String?,
    val killStreamIcon: String?,
    val assetPath: String,
    val weaponStats: WeaponStatsEntity?,
    val shopData: ShopDataEntity?,
    val skins: List<WeaponSkinsEntity>
)