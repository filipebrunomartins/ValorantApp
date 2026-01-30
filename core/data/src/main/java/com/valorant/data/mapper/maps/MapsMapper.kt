package com.valorant.data.mapper.maps

import com.valorant.apiresponse.maps.MapsApiResponse
import com.valorant.data.utils.Mapper
import com.valorant.entity.maps.MapsEntity
import javax.inject.Inject

class MapsMapper @Inject constructor(
    private val mapMapper: MapMapper
) : Mapper<MapsApiResponse, MapsEntity> {

    override fun mapFromApiResponse(type: MapsApiResponse): MapsEntity {
        return MapsEntity(
            status = type.status,
            data = type.data.map { mapMapper.mapFromApiResponse(it) }
        )
    }
}