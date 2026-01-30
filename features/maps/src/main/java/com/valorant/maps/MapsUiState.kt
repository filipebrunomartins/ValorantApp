package com.valorant.maps

import com.valorant.entity.maps.MapsEntity

sealed interface MapsUiState {
    data object Loading : MapsUiState
    data class Success(val data: MapsEntity) : MapsUiState
    data class Error(val message: String) : MapsUiState
}