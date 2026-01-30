package com.valorant.apiresponse.maps

data class MapCalloutApiResponse(
    val regionName: String,
    val superRegion: String,
    val superRegionName: String,
    val location: Vector3ApiResponse,
    val scale3D: Vector3ApiResponse?,
    val rotation: RotationApiResponse?
)