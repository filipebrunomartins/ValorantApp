package com.valorant.agents

import com.valorant.entity.agents.AgentsEntity

sealed interface AgentsUiState {
    data object Loading : AgentsUiState
    data class Success(val data: AgentsEntity) : AgentsUiState
    data class Error(val message: String) : AgentsUiState
}