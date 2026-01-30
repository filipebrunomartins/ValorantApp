package com.valorant.data.apiservice

import com.valorant.apiresponse.ProfileApiResponse
import com.valorant.apiresponse.RepoItemApiResponse
import com.valorant.apiresponse.agents.AgentsApiResponse
import com.valorant.apiresponse.maps.MapsApiResponse
import com.valorant.apiresponse.weapons.WeaponsApiResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("/users/{username}/repos")
    suspend fun fetchRepoList(
        @Path("username")username:String
    ): Response<List<RepoItemApiResponse>>

    @GET("/users/{username}")
    suspend fun fetchProfile(
        @Path("username")username:String
    ):Response<ProfileApiResponse>

    @GET("agents")
    suspend fun getAgents(): Response<AgentsApiResponse>

    @GET("weapons")
    suspend fun getWeapons(): Response<WeaponsApiResponse>

    @GET("maps")
    suspend fun getMaps(): Response<MapsApiResponse>
}