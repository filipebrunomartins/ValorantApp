package com.valorant.entity.agents

data class RoleEntity(
    val uuid: String,
    val displayName: String,
    val description: String,
    val displayIcon: String?,
    val assetPath: String
)