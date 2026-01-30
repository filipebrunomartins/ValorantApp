package com.valorant.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.valorant.home.HomeScreenRoute

const val homeScreenRoute = "homeScreenRoute"

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