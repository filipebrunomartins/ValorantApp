package com.valorant.maps

sealed interface MapsUiAction{
    data object GetMaps:MapsUiAction
}