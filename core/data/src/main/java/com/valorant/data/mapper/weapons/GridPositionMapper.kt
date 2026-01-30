package com.valorant.data.mapper.weapons

import com.valorant.apiresponse.weapons.GridPositionApiResponse
import com.valorant.data.utils.Mapper
import com.valorant.entity.weapons.GridPositionEntity
import javax.inject.Inject

class GridPositionMapper @Inject constructor() :
    Mapper<GridPositionApiResponse, GridPositionEntity> {

    override fun mapFromApiResponse(type: GridPositionApiResponse): GridPositionEntity {
        return GridPositionEntity(
            row = type.row,
            column = type.column
        )
    }
}