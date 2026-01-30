package com.valorant.maps

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.valorant.domain.usecase.maps.MapsUseCase
import com.valorant.domain.utils.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MapsViewModel @Inject constructor(
    private val mapsUseCase: MapsUseCase
): ViewModel(){
    private val _mapsUiState = MutableStateFlow<MapsUiState>(MapsUiState.Loading)
    val mapsUiState get() = _mapsUiState.asStateFlow()

    init {
        getMaps()
    }

    private fun getMaps(){
        viewModelScope.launch {
            mapsUseCase.execute().collect{ response->
                when(response){
                    is Result.Error -> _mapsUiState.value = MapsUiState.Error(response.message)
                    Result.Loading -> _mapsUiState.value = MapsUiState.Loading
                    is Result.Success -> _mapsUiState.value = MapsUiState.Success(response.data)
                }
            }
        }
    }

    fun handleAction(action: MapsUiAction){
        when(action){
            MapsUiAction.GetMaps-> getMaps()
        }
    }
}