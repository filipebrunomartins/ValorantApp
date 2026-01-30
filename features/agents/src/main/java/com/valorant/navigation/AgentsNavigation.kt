package com.valorant.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.valorant.agents.AgentsScreenRoute

const val agentsScreenRoute = "agentsScreenRoute"

fun NavController.navigateToAgentsScreen() {
    navigate(agentsScreenRoute)
}

fun NavGraphBuilder.agentsScreen(
    onBackBtnClick: () -> Unit
) {
    composable(route = agentsScreenRoute) {
        AgentsScreenRoute(
            onBackBtnClick = onBackBtnClick
        )
    }
}