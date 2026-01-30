package com.valorant.apiresponse.agents

data class AgentsApiResponse(
    val status: Int,
    val data: List<AgentApiResponse>
)