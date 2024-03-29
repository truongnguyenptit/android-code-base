package com.trainingdeveloperpro.remote

import com.trainingdeveloperpro.model.ApiResult
import com.trainingdeveloperpro.model.User
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface UserService {

    @GET("search/users")
    fun fetchTopUsersAsync(@Query("q") query: String = "PhilippeB",
                           @Query("sort") sort: String = "followers"): Deferred<ApiResult<User>>

    @GET("users/{login}")
    fun fetchUserDetailsAsync(@Path("login") login: String): Deferred<User>
}