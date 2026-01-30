package com.valorant.domain.repository.maps

import com.valorant.domain.utils.Result
import com.valorant.entity.maps.MapsEntity
import kotlinx.coroutines.flow.Flow

interface MapsRepository {
    suspend fun getMaps():Flow<Result<MapsEntity>>
}