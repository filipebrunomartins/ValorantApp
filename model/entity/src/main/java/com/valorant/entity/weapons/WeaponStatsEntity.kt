package com.valorant.entity.weapons

data class WeaponStatsEntity(
    val fireRate: Double,
    val magazineSize: Int,
    val runSpeedMultiplier: Double,
    val equipTimeSeconds: Double,
    val reloadTimeSeconds: Double,
    val firstBulletAccuracy: Double,
    val shotgunPelletCount: Int,
    val wallPenetration: String,
    val feature: String?,
    val fireMode: String?,
    val altFireType: String?,
    val adsStats: AdsStatsEntity?,
    val altShotgunStats: Any?,
    val airBurstStats: Any?,
    val damageRanges: List<DamageRangeEntity>
)