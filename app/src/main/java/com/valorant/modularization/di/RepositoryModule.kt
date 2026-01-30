package com.valorant.modularization.di

import com.valorant.data.repoimpl.GithubRepoImpl
import com.valorant.data.repoimpl.agents.AgentsRepositoryImpl
import com.valorant.data.repoimpl.maps.MapsRepositoryImpl
import com.valorant.data.repoimpl.weapons.WeaponsRepositoryImpl
import com.valorant.domain.repository.GithubRepository
import com.valorant.domain.repository.agents.AgentsRepository
import com.valorant.domain.repository.maps.MapsRepository
import com.valorant.domain.repository.weapons.WeaponsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindGithubRepository(githubRepoImpl: GithubRepoImpl): GithubRepository

    @Binds
    fun bindAgentsRepository(agentsRepositoryImpl: AgentsRepositoryImpl): AgentsRepository

    @Binds
    fun bindMapsRepository(mapsRepositoryImpl: MapsRepositoryImpl): MapsRepository

    @Binds
    fun bindWeaponsRepository(weaponsRepositoryImpl: WeaponsRepositoryImpl): WeaponsRepository

}