package com.valorant.weapons

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
internal fun WeaponsScreen(
    weaponsUiState: WeaponsUiState,
    onGetWeapons:(WeaponsUiAction)->Unit,
    onBackBtnClick:()->Unit
){
    ScaffoldTopAppbar(
        title = "Weapons",
        onNavigationIconClick = onBackBtnClick
    ) {
        val modifier = Modifier.padding(it)
        Box(
            modifier = modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            when(weaponsUiState){
                is WeaponsUiState.Error -> NetworkErrorMessage(message = weaponsUiState.message){
                    onGetWeapons(WeaponsUiAction.GetWeapons)
                }
                WeaponsUiState.Loading -> CircularProgressIndicator()
                is WeaponsUiState.Success -> WeaponsContentView(weaponsEntity = weaponsUiState.data)
            }
        }
    }
}