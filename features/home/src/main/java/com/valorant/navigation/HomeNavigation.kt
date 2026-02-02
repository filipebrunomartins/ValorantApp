package com.valorant.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.valorant.common.utils.NavRoute.homeScreenRoute
import com.valorant.home.HomeScreenRoute

fun NavController.navigateToHome() {
    navigate(homeScreenRoute)
}

fun NavGraphBuilder.homeScreen(
    onAgentsBtnClick: () -> Unit,
    onWeaponsBtnClick: () -> Unit,
    onMapsBtnClick: () -> Unit
) {
    composable(route = homeScreenRoute) {
        HomeScreenRoute(
            onAgentsBtnClick = onAgentsBtnClick,
            onWeaponsBtnClick = onWeaponsBtnClick,
            onMapsBtnClick = onMapsBtnClick
        )
    }
}