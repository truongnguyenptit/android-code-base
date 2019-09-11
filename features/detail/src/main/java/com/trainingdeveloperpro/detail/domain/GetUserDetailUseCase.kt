package com.trainingdeveloperpro.detail.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.trainingdeveloperpro.model.User
import com.trainingdeveloperpro.repository.UserRepository
import com.trainingdeveloperpro.repository.utils.Resource

/**
 * Use case that gets a [Resource] [User] from [UserRepository]
 * and makes some specific logic actions on it.
 *
 * In this Use Case, I'm just doing nothing... ¯\_(ツ)_/¯
 */
class GetUserDetailUseCase(private val repository: UserRepository) {

    suspend operator fun invoke(forceRefresh: Boolean = false, login: String): LiveData<Resource<User>> {
        return Transformations.map(repository.getUserDetailWithCache(forceRefresh, login)) {
            it // Place here your specific logic actions (if any)
        }
    }
}