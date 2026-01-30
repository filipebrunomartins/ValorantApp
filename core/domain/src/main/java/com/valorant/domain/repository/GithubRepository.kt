package com.valorant.domain.repository

import com.valorant.domain.usecase.ProfileUseCase
import com.valorant.domain.usecase.RepoListUseCase
import com.valorant.entity.ProfileEntity
import com.valorant.entity.RepoItemEntity
import kotlinx.coroutines.flow.Flow
import com.valorant.domain.utils.Result


interface GithubRepository {
    suspend fun fetchRepoList(params: RepoListUseCase.Params): Flow<Result<List<RepoItemEntity>>>
    suspend fun fetchProfile(params: ProfileUseCase.Params):Flow<Result<ProfileEntity>>
}