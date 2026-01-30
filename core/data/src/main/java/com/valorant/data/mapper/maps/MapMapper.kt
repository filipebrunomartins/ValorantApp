package com.valorant.data.mapper.maps

import com.valorant.apiresponse.maps.MapApiResponse
import com.valorant.data.utils.Mapper
import com.valorant.entity.maps.MapEntity
import javax.inject.Inject

class MapMapper @Inject constructor(
    private val mapCalloutMapper: MapCalloutMapper
) : Mapper<MapApiResponse, MapEntity> {

    override fun mapFromApiResponse(type: MapApiResponse): MapEntity {
        return MapEntity(
            uuid = type.uuid,
            displayName = type.displayName,
            narrativeDescription = type.narrativeDescription,
            tacticalDescription = type.tacticalDescription,
            coordinates = type.coordinates,
            displayIcon = type.displayIcon,
            listViewIcon = type.listViewIcon,
            listViewIconTall = type.listViewIconTall,
            splash = type.splash,
            stylizedBackgroundImage = type.stylizedBackgroundImage,
            premierBackgroundImage = type.premierBackgroundImage,
            assetPath = type.assetPath,
            mapUrl = type.mapUrl,
            xMultiplier = type.xMultiplier,
            yMultiplier = type.yMultiplier,
            xScalarToAdd = type.xScalarToAdd,
            yScalarToAdd = type.yScalarToAdd,
            callouts = type.callouts?.map {
                mapCalloutMapper.mapFromApiResponse(it)
            }
        )
    }
}