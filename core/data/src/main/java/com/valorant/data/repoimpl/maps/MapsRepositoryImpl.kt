package com.valorant.data.repoimpl.maps

import com.valorant.data.apiservice.ApiService
import com.valorant.data.mapper.maps.MapsMapper
import com.valorant.data.utils.NetworkBoundResource
import com.valorant.data.utils.mapFromApiResponse
import com.valorant.domain.repository.maps.MapsRepository
import com.valorant.domain.utils.Result
import com.valorant.entity.maps.MapsEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MapsRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val networkBoundResources: NetworkBoundResource,
    private val mapsMapper: MapsMapper
) : MapsRepository {

    override suspend fun getMaps(): Flow<Result<MapsEntity>> {
        return mapFromApiResponse(
            result = networkBoundResources.downloadData {
                apiService.getMaps()
            }, mapsMapper
        )
    }

}