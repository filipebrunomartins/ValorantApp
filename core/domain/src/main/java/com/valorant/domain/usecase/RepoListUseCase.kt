package com.valorant.domain.usecase

import com.valorant.domain.repository.GithubRepository
import com.valorant.domain.utils.ApiUseCaseParams
import com.valorant.domain.utils.Result
import com.valorant.entity.RepoItemEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RepoListUseCase @Inject constructor(
    private val repository: GithubRepository
):ApiUseCaseParams<RepoListUseCase.Params,List<RepoItemEntity>>{
    override suspend fun execute(params: Params): Flow<Result<List<RepoItemEntity>>> {
        return repository.fetchRepoList(params)
    }
    data class Params(val userName:String)
}