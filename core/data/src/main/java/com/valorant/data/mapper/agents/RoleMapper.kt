package com.valorant.data.mapper.agents

import com.valorant.apiresponse.agents.RoleApiResponse
import com.valorant.data.utils.Mapper
import com.valorant.entity.agents.RoleEntity
import javax.inject.Inject

class RoleMapper @Inject constructor() : Mapper<RoleApiResponse, RoleEntity> {
    override fun mapFromApiResponse(type: RoleApiResponse): RoleEntity {
        return RoleEntity(
            uuid = type.uuid,
            displayName = type.displayName,
            description = type.description,
            displayIcon = type.displayIcon,
            assetPath = type.assetPath
        )
    }
}