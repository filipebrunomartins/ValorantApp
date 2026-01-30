package com.valorant.agents

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.valorant.domain.usecase.agents.AgentsUseCase
import com.valorant.domain.utils.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AgentsViewModel @Inject constructor(
    private val agentsUseCase: AgentsUseCase
): ViewModel(){
    private val _agentsUiState = MutableStateFlow<AgentsUiState>(AgentsUiState.Loading)
    val agentsUiState get() = _agentsUiState.asStateFlow()

    init {
        getAgents()
    }

    private fun getAgents(){
        viewModelScope.launch {
            agentsUseCase.execute().collect{ response->
                when(response){
                    is Result.Error -> _agentsUiState.value = AgentsUiState.Error(response.message)
                    Result.Loading -> _agentsUiState.value = AgentsUiState.Loading
                    is Result.Success -> _agentsUiState.value = AgentsUiState.Success(response.data)
                }
            }
        }
    }

    fun handleAction(action: AgentsUiAction){
        when(action){
            AgentsUiAction.GetAgents -> getAgents()
        }
    }
}
