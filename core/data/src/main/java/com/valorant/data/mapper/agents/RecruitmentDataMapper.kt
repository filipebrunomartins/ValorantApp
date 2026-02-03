package com.valorant.data.mapper.agents

import com.valorant.apiresponse.agents.RecruitmentDataApiResponse
import com.valorant.data.mapper.utils.DateMapper
import com.valorant.data.utils.Mapper
import com.valorant.entity.agents.RecruitmentDataEntity
import javax.inject.Inject

class RecruitmentDataMapper @Inject constructor(
    private val dateMapper: DateMapper
) : Mapper<RecruitmentDataApiResponse, RecruitmentDataEntity> {

    override fun mapFromApiResponse(type: RecruitmentDataApiResponse): RecruitmentDataEntity {
        return RecruitmentDataEntity(
            counterId = type.counterId,
            milestoneId = type.milestoneId,
            milestoneThreshold = type.milestoneThreshold,
            useLevelVpCostOverride = type.useLevelVpCostOverride,
            levelVpCostOverride = type.levelVpCostOverride,
            startDate = dateMapper.mapFromApiResponse(type.startDate),
            endDate = dateMapper.mapFromApiResponse(type.endDate)
        )
    }
}