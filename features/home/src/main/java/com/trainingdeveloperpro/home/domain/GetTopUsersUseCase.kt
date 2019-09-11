package com.trainingdeveloperpro.home.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.trainingdeveloperpro.model.User
import com.trainingdeveloperpro.repository.UserRepository
import com.trainingdeveloperpro.repository.utils.Resource

/**
 * Use case that gets a [Resource][List][User] from [UserRepository]
 * and makes some specific logic actions on it.
 *
 * In this Use Case, I'm just doing nothing... ¯\_(ツ)_/¯
 */
class GetTopUsersUseCase(private val repository: UserRepository) {

    suspend operator fun invoke(forceRefresh: Boolean = false): LiveData<Resource<List<User>>> {
        return Transformations.map(repository.getTopUsersWithCache(forceRefresh)) {
            it // Place here your specific logic actions
        }
    }
}