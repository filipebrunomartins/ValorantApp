package com.valorant.apiresponse.weapons

data class DamageRangeApiResponse(
    val rangeStartMeters: Int,
    val rangeEndMeters: Int,
    val headDamage: Double,
    val bodyDamage: Double,
    val legDamage: Double
)