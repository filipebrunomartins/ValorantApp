package com.valorant.apiresponse.weapons

data class WeaponsApiResponse(
    val status: Int,
    val data: List<WeaponApiResponse>
)