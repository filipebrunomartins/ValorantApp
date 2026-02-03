package com.valorant.entity.agents

import java.util.Date

data class RecruitmentDataEntity(
    val counterId: String,
    val milestoneId: String,
    val milestoneThreshold: Int,
    val useLevelVpCostOverride: Boolean,
    val levelVpCostOverride: Int,
    val startDate: Date?,
    val endDate: Date?
)