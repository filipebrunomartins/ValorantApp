package com.valorant.data.mapper.maps

import com.valorant.apiresponse.maps.Vector3ApiResponse
import com.valorant.data.utils.Mapper
import com.valorant.entity.maps.Vector3Entity
import javax.inject.Inject

class Vector3Mapper @Inject constructor() : Mapper<Vector3ApiResponse, Vector3Entity> {

    override fun mapFromApiResponse(type: Vector3ApiResponse): Vector3Entity {
        return Vector3Entity(
            x = type.x,
            y = type.y,
            z = type.z
        )
    }
}