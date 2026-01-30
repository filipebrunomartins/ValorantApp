package com.valorant.entity.maps

data class MapCalloutEntity(
    val regionName: String,
    val superRegion: String,
    val superRegionName: String,
    val location: Vector3Entity,
    val scale3D: Vector3Entity?,
    val rotation: RotationEntity?
)