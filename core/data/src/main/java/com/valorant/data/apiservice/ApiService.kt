package com.valorant.data.apiservice

import com.valorant.apiresponse.agents.AgentsApiResponse
import com.valorant.apiresponse.maps.MapsApiResponse
import com.valorant.apiresponse.weapons.WeaponsApiResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("agents")
    suspend fun getAgents(): Response<AgentsApiResponse>

    @GET("weapons")
    suspend fun getWeapons(): Response<WeaponsApiResponse>

    @GET("maps")
    suspend fun getMaps(): Response<MapsApiResponse>
}