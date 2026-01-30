package com.valorant.entity.agents

data class AgentEntity(
    val uuid: String,
    val displayName: String,
    val description: String,
    val developerName: String,
    val releaseDate: String,
    val characterTags: List<String>?,
    val displayIcon: String?,
    val displayIconSmall: String?,
    val bustPortrait: String?,
    val fullPortrait: String?,
    val fullPortraitV2: String?,
    val killfeedPortrait: String?,
    val minimapPortrait: String?,
    val homeScreenPromoTileImage: String?,
    val background: String?,
    val backgroundGradientColors: List<String>,
    val assetPath: String,
    val isFullPortraitRightFacing: Boolean,
    val isPlayableCharacter: Boolean,
    val isAvailableForTest: Boolean,
    val isBaseContent: Boolean,
    val role: RoleEntity?,
    val recruitmentData: RecruitmentDataEntity?,
    val abilities: List<AbilityEntity>,
    val voiceLine: Any? // sempre null na API
)