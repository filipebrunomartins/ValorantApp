package com.valorant.data.mapper.maps

import com.valorant.apiresponse.maps.RotationApiResponse
import com.valorant.data.utils.Mapper
import com.valorant.entity.maps.RotationEntity
import javax.inject.Inject

class RotationMapper @Inject constructor() : Mapper<RotationApiResponse, RotationEntity> {

    override fun mapFromApiResponse(type: RotationApiResponse): RotationEntity {
        return RotationEntity(
            pitch = type.pitch,
            yaw = type.yaw,
            roll = type.roll
        )
    }
}