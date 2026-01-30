package com.valorant.modularization.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.valorant.navigation.agentsScreen
import com.valorant.navigation.homeScreen
import com.valorant.navigation.homeScreenRoute
import com.valorant.navigation.mapsScreen
import com.valorant.navigation.navigateToAgentsScreen
import com.valorant.navigation.navigateToMapsScreen
import com.valorant.navigation.navigateToWeaponsScreen
import com.valorant.navigation.weaponsScreen
import com.valorant.profile.navigateToProfileScreen
import com.valorant.profile.profileScreen
import com.valorant.repolist.repoListScreen

@Composable
fun AppNavigation(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = homeScreenRoute
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        homeScreen(
            onAgentsBtnClick = navController::navigateToAgentsScreen,
            onMapsBtnClick = navController::navigateToMapsScreen,
            onWeaponsBtnClick = navController::navigateToWeaponsScreen
        )
        repoListScreen(onRepoItemClick = navController::navigateToProfileScreen)
        profileScreen(onBackBtnClick = navController::popBackStackOrIgnore)
        agentsScreen(onBackBtnClick = navController::popBackStackOrIgnore)
        mapsScreen(onBackBtnClick = navController::popBackStackOrIgnore)
        weaponsScreen(onBackBtnClick = navController::popBackStackOrIgnore)
    }
}

fun NavController.popBackStackOrIgnore() {
    if (currentBackStackEntry?.lifecycle?.currentState == Lifecycle.State.RESUMED) {
        popBackStack()
    }
}