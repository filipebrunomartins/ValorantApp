package com.valorant.apiresponse.agents

data class AgentApiResponse(
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
    val role: RoleApiResponse?,
    val recruitmentData: RecruitmentDataApiResponse?,
    val abilities: List<AbilityApiResponse>,
    val voiceLine: Any? // sempre null na API
)