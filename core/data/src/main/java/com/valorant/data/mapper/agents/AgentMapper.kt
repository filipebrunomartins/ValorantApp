package com.valorant.data.mapper.agents

import com.valorant.apiresponse.agents.AgentApiResponse
import com.valorant.data.utils.Mapper
import com.valorant.entity.agents.AgentEntity
import javax.inject.Inject

class AgentMapper @Inject constructor(
    private val roleMapper: RoleMapper,
    private val recruitmentDataMapper: RecruitmentDataMapper,
    private val abilityMapper: AbilityMapper
) : Mapper<AgentApiResponse, AgentEntity> {

    override fun mapFromApiResponse(type: AgentApiResponse): AgentEntity {
        return AgentEntity(
            uuid = type.uuid,
            displayName = type.displayName,
            description = type.description,
            developerName = type.developerName,
            releaseDate = type.releaseDate,
            characterTags = type.characterTags,
            displayIcon = type.displayIcon,
            displayIconSmall = type.displayIconSmall,
            bustPortrait = type.bustPortrait,
            fullPortrait = type.fullPortrait,
            fullPortraitV2 = type.fullPortraitV2,
            killfeedPortrait = type.killfeedPortrait,
            minimapPortrait = type.minimapPortrait,
            homeScreenPromoTileImage = type.homeScreenPromoTileImage,
            background = type.background,
            backgroundGradientColors = type.backgroundGradientColors,
            assetPath = type.assetPath,
            isFullPortraitRightFacing = type.isFullPortraitRightFacing,
            isPlayableCharacter = type.isPlayableCharacter,
            isAvailableForTest = type.isAvailableForTest,
            isBaseContent = type.isBaseContent,
            role = type.role?.let { roleMapper.mapFromApiResponse(it) },
            recruitmentData = type.recruitmentData?.let {
                recruitmentDataMapper.mapFromApiResponse(it)
            },
            abilities = type.abilities.map {
                abilityMapper.mapFromApiResponse(it)
            },
            voiceLine = type.voiceLine
        )
    }
}