package com.valorant.apiresponse.maps

data class MapsApiResponse(
    val status: Int,
    val data: List<MapApiResponse>
)