package com.valorant.data.mapper.weapons

import com.valorant.apiresponse.weapons.DamageRangeApiResponse
import com.valorant.data.utils.Mapper
import com.valorant.entity.weapons.DamageRangeEntity
import javax.inject.Inject

class DamageRangeMapper @Inject constructor() : Mapper<DamageRangeApiResponse, DamageRangeEntity> {

    override fun mapFromApiResponse(type: DamageRangeApiResponse): DamageRangeEntity {
        return DamageRangeEntity(
            rangeStartMeters = type.rangeStartMeters,
            rangeEndMeters = type.rangeEndMeters,
            headDamage = type.headDamage,
            bodyDamage = type.bodyDamage,
            legDamage = type.legDamage
        )
    }
}