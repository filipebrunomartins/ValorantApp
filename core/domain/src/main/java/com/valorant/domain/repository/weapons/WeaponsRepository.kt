package com.valorant.domain.repository.weapons

import com.valorant.domain.utils.Result
import com.valorant.entity.weapons.WeaponsEntity
import kotlinx.coroutines.flow.Flow

interface WeaponsRepository {
    suspend fun getWeapons():Flow<Result<WeaponsEntity>>
}