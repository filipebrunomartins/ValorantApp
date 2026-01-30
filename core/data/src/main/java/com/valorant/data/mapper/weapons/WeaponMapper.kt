package com.valorant.data.mapper.weapons

import com.valorant.apiresponse.weapons.WeaponApiResponse
import com.valorant.data.utils.Mapper
import com.valorant.entity.weapons.WeaponEntity
import javax.inject.Inject

class WeaponMapper @Inject constructor(
    private val weaponStatsMapper: WeaponStatsMapper,
    private val shopDataMapper: ShopDataMapper,
    private val weaponSkinsMapper: WeaponSkinsMapper
) : Mapper<WeaponApiResponse, WeaponEntity> {

    override fun mapFromApiResponse(type: WeaponApiResponse): WeaponEntity {
        return WeaponEntity(
            uuid = type.uuid,
            displayName = type.displayName,
            category = type.category,
            defaultSkinUuid = type.defaultSkinUuid,
            displayIcon = type.displayIcon,
            killStreamIcon = type.killStreamIcon,
            assetPath = type.assetPath,
            weaponStats = type.weaponStats?.let {
                weaponStatsMapper.mapFromApiResponse(it)
            },
            shopData = type.shopData?.let {
                shopDataMapper.mapFromApiResponse(it)
            },
            skins = type.skins.map {
                weaponSkinsMapper.mapFromApiResponse(it)
            }
        )
    }
}