package com.valorant.maps

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.valorant.designsystem.component.ScaffoldTopAppbar
import com.valorant.ui.component.NetworkErrorMessage

@Composable
internal fun MapsScreen(
    agentsUiState: MapsUiState,
    onGetMaps:(MapsUiAction)->Unit,
    onBackBtnClick:()->Unit
){
    ScaffoldTopAppbar(
        title = "Maps",
        onNavigationIconClick = onBackBtnClick
    ) {
        val modifier = Modifier.padding(it)
        Box(
            modifier = modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            when(agentsUiState){
                is MapsUiState.Error -> NetworkErrorMessage(message = agentsUiState.message){
                    onGetMaps(MapsUiAction.GetMaps)
                }
                MapsUiState.Loading -> CircularProgressIndicator()
                is MapsUiState.Success -> MapsContentView(mapsEntity = agentsUiState.data)
            }
        }
    }
}