package com.valorant.entity.weapons

data class DamageRangeEntity(
    val rangeStartMeters: Int,
    val rangeEndMeters: Int,
    val headDamage: Double,
    val bodyDamage: Double,
    val legDamage: Double
)