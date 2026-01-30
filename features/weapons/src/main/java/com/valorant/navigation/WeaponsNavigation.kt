package com.valorant.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.valorant.weapons.WeaponsScreenRoute

const val weaponsScreenRoute = "weaponsScreenRoute"

fun NavController.navigateToWeaponsScreen() {
    navigate(weaponsScreenRoute)
}

fun NavGraphBuilder.weaponsScreen(
    onBackBtnClick: () -> Unit
) {
    composable(route = weaponsScreenRoute) {
        WeaponsScreenRoute(
            onBackBtnClick = onBackBtnClick
        )
    }
}