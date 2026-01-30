package com.valorant.domain.usecase.maps

import com.valorant.domain.repository.maps.MapsRepository
import com.valorant.domain.utils.ApiUseCaseNonParams
import com.valorant.domain.utils.Result
import com.valorant.entity.maps.MapsEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MapsUseCase @Inject constructor(
    private val repository: MapsRepository
): ApiUseCaseNonParams<MapsEntity> {
    override suspend fun execute(): Flow<Result<MapsEntity>> {
        return repository.getMaps()
    }
}