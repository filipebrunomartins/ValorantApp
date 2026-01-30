package com.valorant.domain.usecase.agents

import com.valorant.domain.repository.agents.AgentsRepository
import com.valorant.domain.utils.ApiUseCaseNonParams
import com.valorant.domain.utils.Result
import com.valorant.entity.agents.AgentsEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AgentsUseCase @Inject constructor(
    private val repository: AgentsRepository
): ApiUseCaseNonParams<AgentsEntity> {
    override suspend fun execute(): Flow<Result<AgentsEntity>> {
        return repository.getAgents()
    }
}