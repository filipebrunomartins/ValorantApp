package com.valorant.domain.usecase.weapons

import com.valorant.domain.repository.weapons.WeaponsRepository
import com.valorant.domain.utils.ApiUseCaseNonParams
import com.valorant.domain.utils.Result

import com.valorant.entity.weapons.WeaponsEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class WeaponsUseCase @Inject constructor(
    private val repository: WeaponsRepository
): ApiUseCaseNonParams<WeaponsEntity> {
    override suspend fun execute(): Flow<Result<WeaponsEntity>> {
        return repository.getWeapons()
    }
}