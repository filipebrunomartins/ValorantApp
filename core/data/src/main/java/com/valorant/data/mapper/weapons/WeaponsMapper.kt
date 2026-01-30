package com.valorant.data.mapper.weapons

import com.valorant.apiresponse.weapons.WeaponsApiResponse
import com.valorant.data.utils.Mapper
import com.valorant.entity.weapons.WeaponsEntity
import javax.inject.Inject

class WeaponsMapper @Inject constructor(
    private val weaponMapper: WeaponMapper
) : Mapper<WeaponsApiResponse, WeaponsEntity> {

    override fun mapFromApiResponse(type: WeaponsApiResponse): WeaponsEntity {
        return WeaponsEntity(
            status = type.status,
            data = type.data.map { weaponMapper.mapFromApiResponse(it) }
        )
    }
}