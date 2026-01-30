package com.valorant.maps

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
internal fun MapsScreenRoute(
    viewModel: MapsViewModel = hiltViewModel(),
    onBackBtnClick:()->Unit
){
    val agentsUiState by viewModel.mapsUiState.collectAsStateWithLifecycle()
    MapsScreen(
        agentsUiState = agentsUiState,
        onGetMaps = viewModel::handleAction,
        onBackBtnClick = onBackBtnClick
    )
}