package com.valorant.data.repoimpl.agents

import com.valorant.data.apiservice.ApiService
import com.valorant.data.mapper.agents.AgentsMapper
import com.valorant.data.utils.NetworkBoundResource
import com.valorant.data.utils.mapFromApiResponse
import com.valorant.domain.repository.agents.AgentsRepository
import com.valorant.domain.utils.Result
import com.valorant.entity.agents.AgentsEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AgentsRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val networkBoundResources: NetworkBoundResource,
    private val agentsMapper: AgentsMapper
) : AgentsRepository {

    override suspend fun getAgents(): Flow<Result<AgentsEntity>> {
        return mapFromApiResponse(
            result = networkBoundResources.downloadData {
                apiService.getAgents()
            }, agentsMapper
        )
    }

}