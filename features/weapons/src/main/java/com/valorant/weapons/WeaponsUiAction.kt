package com.valorant.weapons

sealed interface WeaponsUiAction {
    data object GetWeapons : WeaponsUiAction
}