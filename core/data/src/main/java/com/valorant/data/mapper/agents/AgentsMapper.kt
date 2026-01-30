package com.valorant.data.mapper.agents

import com.valorant.apiresponse.agents.AgentsApiResponse
import com.valorant.data.utils.Mapper
import com.valorant.entity.agents.AgentsEntity
import javax.inject.Inject

class AgentsMapper @Inject constructor(
    private val agentMapper: AgentMapper
) : Mapper<AgentsApiResponse, AgentsEntity> {
    override fun mapFromApiResponse(type: AgentsApiResponse): AgentsEntity {
        return AgentsEntity(
            status = type.status,
            data = type.data.map { agentMapper.mapFromApiResponse(it) }
        )
    }
}