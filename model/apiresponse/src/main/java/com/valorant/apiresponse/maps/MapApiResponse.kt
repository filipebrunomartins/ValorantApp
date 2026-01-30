package com.valorant.apiresponse.maps

data class MapApiResponse(
    val uuid: String,
    val displayName: String,
    val narrativeDescription: String?,
    val tacticalDescription: String?,
    val coordinates: String?,
    val displayIcon: String?,
    val listViewIcon: String?,
    val listViewIconTall: String?,
    val splash: String?,
    val stylizedBackgroundImage: String?,
    val premierBackgroundImage: String?,
    val assetPath: String,
    val mapUrl: String,
    val xMultiplier: Double,
    val yMultiplier: Double,
    val xScalarToAdd: Double,
    val yScalarToAdd: Double,
    val callouts: List<MapCalloutApiResponse>?
)