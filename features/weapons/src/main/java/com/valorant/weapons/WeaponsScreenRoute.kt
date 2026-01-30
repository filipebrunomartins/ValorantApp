package com.valorant.weapons

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
internal fun WeaponsScreenRoute(
    viewModel: WeaponsViewModel = hiltViewModel(),
    onBackBtnClick:()->Unit
){
    val agentsUiState by viewModel.weaponsUiState.collectAsStateWithLifecycle()
    WeaponsScreen(
        weaponsUiState = agentsUiState,
        onGetWeapons = viewModel::handleAction,
        onBackBtnClick = onBackBtnClick
    )
}