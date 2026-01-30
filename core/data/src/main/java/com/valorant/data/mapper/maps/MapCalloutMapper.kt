package com.valorant.data.mapper.maps

import com.valorant.apiresponse.maps.MapCalloutApiResponse
import com.valorant.data.utils.Mapper
import com.valorant.entity.maps.MapCalloutEntity
import javax.inject.Inject

class MapCalloutMapper @Inject constructor(
    private val vector3Mapper: Vector3Mapper,
    private val rotationMapper: RotationMapper
) : Mapper<MapCalloutApiResponse, MapCalloutEntity> {

    override fun mapFromApiResponse(type: MapCalloutApiResponse): MapCalloutEntity {
        return MapCalloutEntity(
            regionName = type.regionName,
            superRegion = type.superRegion,
            superRegionName = type.superRegionName,
            location = vector3Mapper.mapFromApiResponse(type.location),
            scale3D = type.scale3D?.let {
                vector3Mapper.mapFromApiResponse(it)
            },
            rotation = type.rotation?.let {
                rotationMapper.mapFromApiResponse(it)
            }
        )
    }
}