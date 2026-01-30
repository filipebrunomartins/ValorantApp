package com.valorant.agents

sealed interface AgentsUiAction{
    data object GetAgents:AgentsUiAction
}