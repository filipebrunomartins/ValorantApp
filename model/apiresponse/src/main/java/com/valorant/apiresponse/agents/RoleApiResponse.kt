package com.valorant.apiresponse.agents

data class RoleApiResponse(
    val uuid: String,
    val displayName: String,
    val description: String,
    val displayIcon: String?,
    val assetPath: String
)