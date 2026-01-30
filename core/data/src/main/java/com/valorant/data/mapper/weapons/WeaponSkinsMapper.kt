package com.valorant.data.mapper.weapons

import com.valorant.apiresponse.weapons.WeaponSkinsApiResponse
import com.valorant.data.utils.Mapper
import com.valorant.entity.weapons.WeaponSkinsEntity
import javax.inject.Inject

class WeaponSkinsMapper @Inject constructor(
    private val weaponSkinChromaMapper: WeaponSkinChromaMapper,
    private val weaponSkinLevelMapper: WeaponSkinLevelMapper
) : Mapper<WeaponSkinsApiResponse, WeaponSkinsEntity> {

    override fun mapFromApiResponse(type: WeaponSkinsApiResponse): WeaponSkinsEntity {
        return WeaponSkinsEntity(
            uuid = type.uuid,
            displayName = type.displayName,
            themeUuid = type.themeUuid,
            contentTierUuid = type.contentTierUuid,
            displayIcon = type.displayIcon,
            wallpaper = type.wallpaper,
            assetPath = type.assetPath,
            chromas = type.chromas.map {
                weaponSkinChromaMapper.mapFromApiResponse(it)
            },
            levels = type.levels.map {
                weaponSkinLevelMapper.mapFromApiResponse(it)
            }
        )
    }
}