package com.valorant.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.valorant.maps.MapsScreenRoute

const val mapsScreenRoute = "mapsScreenRoute"

fun NavController.navigateToMapsScreen() {
    navigate(mapsScreenRoute)
}

fun NavGraphBuilder.mapsScreen(
    onBackBtnClick: () -> Unit
) {
    composable(route = mapsScreenRoute) {
        MapsScreenRoute(
            onBackBtnClick = onBackBtnClick
        )
    }
}