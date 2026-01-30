package com.valorant.apiresponse.agents

data class RecruitmentDataApiResponse(
    val counterId: String,
    val milestoneId: String,
    val milestoneThreshold: Int,
    val useLevelVpCostOverride: Boolean,
    val levelVpCostOverride: Int,
    val startDate: String,
    val endDate: String
)