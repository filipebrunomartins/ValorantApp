package com.valorant.data.mapper.weapons

import com.valorant.apiresponse.weapons.WeaponStatsApiResponse
import com.valorant.data.utils.Mapper
import com.valorant.entity.weapons.WeaponStatsEntity
import javax.inject.Inject

class WeaponStatsMapper @Inject constructor(
    private val adsStatsMapper: AdsStatsMapper,
    private val damageRangeMapper: DamageRangeMapper
) : Mapper<WeaponStatsApiResponse, WeaponStatsEntity> {

    override fun mapFromApiResponse(type: WeaponStatsApiResponse): WeaponStatsEntity {
        return WeaponStatsEntity(
            fireRate = type.fireRate,
            magazineSize = type.magazineSize,
            runSpeedMultiplier = type.runSpeedMultiplier,
            equipTimeSeconds = type.equipTimeSeconds,
            reloadTimeSeconds = type.reloadTimeSeconds,
            firstBulletAccuracy = type.firstBulletAccuracy,
            shotgunPelletCount = type.shotgunPelletCount,
            wallPenetration = type.wallPenetration,
            feature = type.feature,
            fireMode = type.fireMode,
            altFireType = type.altFireType,
            adsStats = type.adsStats?.let {
                adsStatsMapper.mapFromApiResponse(it)
            },
            altShotgunStats = type.altShotgunStats,
            airBurstStats = type.airBurstStats,
            damageRanges = type.damageRanges.map {
                damageRangeMapper.mapFromApiResponse(it)
            }
        )
    }
}