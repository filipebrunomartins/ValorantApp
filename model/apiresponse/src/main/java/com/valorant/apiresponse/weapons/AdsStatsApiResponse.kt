package com.valorant.apiresponse.weapons

data class AdsStatsApiResponse(
    val zoomMultiplier: Double,
    val fireRate: Double,
    val runSpeedMultiplier: Double,
    val burstCount: Int,
    val firstBulletAccuracy: Double
)