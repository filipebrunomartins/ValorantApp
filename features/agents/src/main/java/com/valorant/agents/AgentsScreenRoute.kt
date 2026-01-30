package com.valorant.agents

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
internal fun AgentsScreenRoute(
    viewModel: AgentsViewModel = hiltViewModel(),
    onBackBtnClick:()->Unit
){
    val agentsUiState by viewModel.agentsUiState.collectAsStateWithLifecycle()
    AgentsScreen(
        agentsUiState = agentsUiState,
        onGetAgents = viewModel::handleAction,
        onBackBtnClick = onBackBtnClick
    )
}