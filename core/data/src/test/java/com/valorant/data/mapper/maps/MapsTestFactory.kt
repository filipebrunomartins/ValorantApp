package com.valorant.data.mapper.maps

import com.valorant.apiresponse.maps.MapApiResponse
import com.valorant.apiresponse.maps.MapCalloutApiResponse
import com.valorant.apiresponse.maps.MapsApiResponse
import com.valorant.apiresponse.maps.RotationApiResponse
import com.valorant.apiresponse.maps.Vector3ApiResponse

internal object MapsTestFactory {

    fun defaultMapsApiResponse(
        status: Int = 200,
        data: List<MapApiResponse> = listOf(defaultMapApiResponse())
    ) = MapsApiResponse(
        status = status,
        data = data
    )

    fun defaultMapApiResponse(
        callouts: List<MapCalloutApiResponse>? = listOf(defaultMapCalloutApiResponse())
    ) = MapApiResponse(
        uuid = "7eaecc1b-4337-bbf6-6ab9-04b8f06b3319",
        displayName = "Ascent",
        narrativeDescription = null,
        tacticalDescription = "A/B Sites",
        coordinates = "45\\u00B026\\u0027BF\\u0027N,12\\u00B020\\u0027Q\\u0027E",
        displayIcon = "https://media.valorant-api.com/maps/7eaecc1b-4337-bbf6-6ab9-04b8f06b3319/displayicon.png",
        listViewIcon = "https://media.valorant-api.com/maps/7eaecc1b-4337-bbf6-6ab9-04b8f06b3319/listviewicon.png",
        listViewIconTall = "https://media.valorant-api.com/maps/7eaecc1b-4337-bbf6-6ab9-04b8f06b3319/listviewicontall.png",
        splash = "https://media.valorant-api.com/maps/7eaecc1b-4337-bbf6-6ab9-04b8f06b3319/splash.png",
        stylizedBackgroundImage = "https://media.valorant-api.com/maps/7eaecc1b-4337-bbf6-6ab9-04b8f06b3319/stylizedbackgroundimage.png",
        premierBackgroundImage = "https://media.valorant-api.com/maps/7eaecc1b-4337-bbf6-6ab9-04b8f06b3319/premierbackgroundimage.png",
        assetPath = "ShooterGame/Content/Maps/Ascent/Ascent_PrimaryAsset",
        mapUrl = "/Game/Maps/Ascent/Ascent",
        xMultiplier = 7E-05,
        yMultiplier = -7E-05,
        xScalarToAdd = 0.813895,
        yScalarToAdd = 0.573242,
        callouts = callouts
    )

    fun defaultMapCalloutApiResponse(
        location: Vector3ApiResponse = defaultLocationResponse(),
        scale3D: Vector3ApiResponse? = defaultScale3DResponse(),
        rotation: RotationApiResponse? = defaultRotationApiResponse()
    ) = MapCalloutApiResponse(
        regionName = "Spawn",
        superRegion = "ECalloutSuperRegion::AttackerSide",
        superRegionName = "Attacker Side",
        location = location,
        scale3D = scale3D,
        rotation = rotation
    )

    private fun defaultLocationResponse(
        x: Double = 60.0,
        y: Double = 50.0,
        z: Double = 190.0
    ) = Vector3ApiResponse(
        x = x,
        y = y,
        z = z
    )

    private fun defaultScale3DResponse(
        x: Double = 1.0,
        y: Double = 1.0,
        z: Double = 4.25
    ) = Vector3ApiResponse(
        x = x,
        y = y,
        z = z
    )

    private fun defaultRotationApiResponse(
        pitch: Double = 0.0,
        yaw: Double = 90.00012,
        roll: Double = 0.0
    ) = RotationApiResponse(
        pitch = pitch,
        yaw = yaw,
        roll = roll
    )
}