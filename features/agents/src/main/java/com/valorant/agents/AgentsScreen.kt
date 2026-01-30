package com.valorant.agents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.valorant.designsystem.component.ScaffoldTopAppbar
import com.valorant.ui.component.NetworkErrorMessage

@Composable
internal fun AgentsScreen(
    agentsUiState: AgentsUiState,
    onGetAgents:(AgentsUiAction)->Unit,
    onBackBtnClick:()->Unit
){
    ScaffoldTopAppbar(
        title = "Agents",
        onNavigationIconClick = onBackBtnClick
    ) {
        val modifier = Modifier.padding(it)
        Box(
            modifier = modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            when(agentsUiState){
                is AgentsUiState.Error -> NetworkErrorMessage(message = agentsUiState.message){
                    onGetAgents(AgentsUiAction.GetAgents)
                }
                AgentsUiState.Loading -> CircularProgressIndicator()
                is AgentsUiState.Success -> AgentsContentView(agentsEntity = agentsUiState.data)
            }
        }
    }
}