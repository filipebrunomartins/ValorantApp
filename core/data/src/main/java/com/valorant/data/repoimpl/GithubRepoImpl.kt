package com.valorant.data.repoimpl

import com.valorant.data.apiservice.ApiService
import com.valorant.data.mapper.ProfileMapper
import com.valorant.data.mapper.RepoListItemMapper
import com.valorant.data.utils.NetworkBoundResource
import com.valorant.data.utils.mapFromApiResponse
import com.valorant.domain.repository.GithubRepository
import com.valorant.domain.usecase.ProfileUseCase
import com.valorant.domain.usecase.RepoListUseCase
import com.valorant.domain.utils.Result
import com.valorant.entity.ProfileEntity
import com.valorant.entity.RepoItemEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GithubRepoImpl @Inject constructor(
    private val apiService: ApiService,
    private val networkBoundResources: NetworkBoundResource,
    private val repositoryListItemMapper: RepoListItemMapper,
    private val profileMapper: ProfileMapper
):GithubRepository{

    override suspend fun fetchRepoList(params: RepoListUseCase.Params): Flow<Result<List<RepoItemEntity>>> {
        return mapFromApiResponse(
            result = networkBoundResources.downloadData {
                apiService.fetchRepoList(params.userName)
            },repositoryListItemMapper
        )
    }

    override suspend fun fetchProfile(params: ProfileUseCase.Params): Flow<Result<ProfileEntity>> {
        return mapFromApiResponse(
            result = networkBoundResources.downloadData {
                apiService.fetchProfile(params.userName)
            },profileMapper
        )
    }

}