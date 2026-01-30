package com.valorant.data.repoimpl.weapons

import com.valorant.data.apiservice.ApiService
import com.valorant.data.mapper.weapons.WeaponsMapper
import com.valorant.data.utils.NetworkBoundResource
import com.valorant.data.utils.mapFromApiResponse
import com.valorant.domain.repository.weapons.WeaponsRepository
import com.valorant.domain.utils.Result
import com.valorant.entity.weapons.WeaponsEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class WeaponsRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val networkBoundResources: NetworkBoundResource,
    private val weaponsMapper: WeaponsMapper
) : WeaponsRepository {

    override suspend fun getWeapons(): Flow<Result<WeaponsEntity>> {
        return mapFromApiResponse(
            result = networkBoundResources.downloadData {
                apiService.getWeapons()
            }, weaponsMapper
        )
    }

}