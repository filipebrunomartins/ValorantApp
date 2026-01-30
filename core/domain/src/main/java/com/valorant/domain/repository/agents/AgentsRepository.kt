package com.valorant.domain.repository.agents

import com.valorant.domain.utils.Result
import com.valorant.entity.agents.AgentsEntity
import kotlinx.coroutines.flow.Flow

interface AgentsRepository {
    suspend fun getAgents():Flow<Result<AgentsEntity>>
}