package com.valorant.home

import androidx.compose.runtime.Composable

@Composable
internal fun HomeScreenRoute(
    onAgentsBtnClick: () -> Unit,
    onWeaponsBtnClick: () -> Unit,
    onMapsBtnClick: () -> Unit
){
    HomeScreen(
        onAgentsBtnClick = onAgentsBtnClick,
        onWeaponsBtnClick = onWeaponsBtnClick,
        onMapsBtnClick = onMapsBtnClick
    )
}