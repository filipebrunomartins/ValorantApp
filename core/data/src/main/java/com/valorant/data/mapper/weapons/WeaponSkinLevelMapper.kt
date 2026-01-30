package com.valorant.data.mapper.weapons

import com.valorant.apiresponse.weapons.WeaponSkinLevelApiResponse
import com.valorant.data.utils.Mapper
import com.valorant.entity.weapons.WeaponSkinLevelEntity
import javax.inject.Inject

class WeaponSkinLevelMapper @Inject constructor() :
    Mapper<WeaponSkinLevelApiResponse, WeaponSkinLevelEntity> {

    override fun mapFromApiResponse(type: WeaponSkinLevelApiResponse): WeaponSkinLevelEntity {
        return WeaponSkinLevelEntity(
            uuid = type.uuid,
            displayName = type.displayName,
            levelItem = type.levelItem,
            displayIcon = type.displayIcon,
            streamedVideo = type.streamedVideo,
            assetPath = type.assetPath
        )
    }
}