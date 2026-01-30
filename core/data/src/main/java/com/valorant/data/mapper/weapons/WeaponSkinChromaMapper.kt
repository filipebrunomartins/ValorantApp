package com.valorant.data.mapper.weapons

import com.valorant.apiresponse.weapons.WeaponSkinChromaApiResponse
import com.valorant.data.utils.Mapper
import com.valorant.entity.weapons.WeaponSkinChromaEntity
import javax.inject.Inject

class WeaponSkinChromaMapper @Inject constructor() :
    Mapper<WeaponSkinChromaApiResponse, WeaponSkinChromaEntity> {

    override fun mapFromApiResponse(type: WeaponSkinChromaApiResponse): WeaponSkinChromaEntity {
        return WeaponSkinChromaEntity(
            uuid = type.uuid,
            displayName = type.displayName,
            displayIcon = type.displayIcon,
            fullRender = type.fullRender,
            swatch = type.swatch,
            streamedVideo = type.streamedVideo,
            assetPath = type.assetPath
        )
    }
}