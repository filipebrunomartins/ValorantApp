package com.valorant.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.valorant.common.utils.NavRoute.mapsScreenRoute
import com.valorant.maps.MapsScreenRoute

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