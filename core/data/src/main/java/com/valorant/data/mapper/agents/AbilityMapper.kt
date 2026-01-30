package com.valorant.data.mapper.agents

import com.valorant.apiresponse.agents.AbilityApiResponse
import com.valorant.data.utils.Mapper
import com.valorant.entity.agents.AbilityEntity
import javax.inject.Inject

class AbilityMapper @Inject constructor() : Mapper<AbilityApiResponse, AbilityEntity> {
    override fun mapFromApiResponse(type: AbilityApiResponse): AbilityEntity {
        return AbilityEntity(
            slot = type.slot,
            displayName = type.displayName,
            description = type.description,
            displayIcon = type.displayIcon
        )
    }
}