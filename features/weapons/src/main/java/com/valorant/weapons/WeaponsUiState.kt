package com.valorant.weapons

import com.valorant.entity.weapons.WeaponsEntity

sealed interface WeaponsUiState {
    data object Loading : WeaponsUiState
    data class Success(val data: WeaponsEntity) : WeaponsUiState
    data class Error(val message: String) : WeaponsUiState
}