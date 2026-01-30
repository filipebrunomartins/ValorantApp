package com.valorant.data.mapper.weapons

import com.valorant.apiresponse.weapons.AdsStatsApiResponse
import com.valorant.data.utils.Mapper
import com.valorant.entity.weapons.AdsStatsEntity
import javax.inject.Inject

class AdsStatsMapper @Inject constructor() : Mapper<AdsStatsApiResponse, AdsStatsEntity> {

    override fun mapFromApiResponse(type: AdsStatsApiResponse): AdsStatsEntity {
        return AdsStatsEntity(
            zoomMultiplier = type.zoomMultiplier,
            fireRate = type.fireRate,
            runSpeedMultiplier = type.runSpeedMultiplier,
            burstCount = type.burstCount,
            firstBulletAccuracy = type.firstBulletAccuracy
        )
    }
}