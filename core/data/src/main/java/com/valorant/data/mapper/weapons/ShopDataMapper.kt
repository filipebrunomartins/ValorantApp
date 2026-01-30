package com.valorant.data.mapper.weapons

import com.valorant.apiresponse.weapons.ShopDataApiResponse
import com.valorant.data.utils.Mapper
import com.valorant.entity.weapons.ShopDataEntity
import javax.inject.Inject

class ShopDataMapper @Inject constructor(
    private val gridPositionMapper: GridPositionMapper
) : Mapper<ShopDataApiResponse, ShopDataEntity> {

    override fun mapFromApiResponse(type: ShopDataApiResponse): ShopDataEntity {
        return ShopDataEntity(
            cost = type.cost,
            category = type.category,
            shopOrderPriority = type.shopOrderPriority,
            categoryText = type.categoryText,
            gridPosition = type.gridPosition?.let {
                gridPositionMapper.mapFromApiResponse(it)
            },
            canBeTrashed = type.canBeTrashed,
            image = type.image,
            newImage = type.newImage,
            newImage2 = type.newImage2,
            assetPath = type.assetPath
        )
    }
}