package com.valorant.data.mapper.agents

import com.valorant.apiresponse.agents.RecruitmentDataApiResponse
import com.valorant.data.utils.Mapper
import com.valorant.entity.agents.RecruitmentDataEntity
import javax.inject.Inject

class RecruitmentDataMapper @Inject constructor() :
    Mapper<RecruitmentDataApiResponse, RecruitmentDataEntity> {
    override fun mapFromApiResponse(type: RecruitmentDataApiResponse): RecruitmentDataEntity {
        return RecruitmentDataEntity(
            counterId = type.counterId,
            milestoneId = type.milestoneId,
            milestoneThreshold = type.milestoneThreshold,
            useLevelVpCostOverride = type.useLevelVpCostOverride,
            levelVpCostOverride = type.levelVpCostOverride,
            startDate = type.startDate,
            endDate = type.endDate
        )
    }
}