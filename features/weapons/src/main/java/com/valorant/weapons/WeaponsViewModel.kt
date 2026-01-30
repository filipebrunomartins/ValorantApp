package com.valorant.weapons

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.valorant.domain.usecase.maps.MapsUseCase
import com.valorant.domain.usecase.weapons.WeaponsUseCase
import com.valorant.domain.utils.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeaponsViewModel @Inject constructor(
    private val weaponsUseCase: WeaponsUseCase
): ViewModel(){
    private val _weaponsUiState = MutableStateFlow<WeaponsUiState>(WeaponsUiState.Loading)
    val weaponsUiState get() = _weaponsUiState.asStateFlow()

    init {
        getMaps()
    }

    private fun getMaps(){
        viewModelScope.launch {
            weaponsUseCase.execute().collect{ response->
                when(response){
                    is Result.Error -> _weaponsUiState.value = WeaponsUiState.Error(response.message)
                    Result.Loading -> _weaponsUiState.value = WeaponsUiState.Loading
                    is Result.Success -> _weaponsUiState.value = WeaponsUiState.Success(response.data)
                }
            }
        }
    }

    fun handleAction(action: WeaponsUiAction){
        when(action){
            WeaponsUiAction.GetWeapons-> getMaps()
        }
    }
}