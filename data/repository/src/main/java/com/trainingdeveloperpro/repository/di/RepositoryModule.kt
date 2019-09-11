package com.trainingdeveloperpro.repository.di

import com.trainingdeveloperpro.repository.AppDispatchers
import com.trainingdeveloperpro.repository.UserRepository
import com.trainingdeveloperpro.repository.UserRepositoryImpl
import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module.module

val repositoryModule = module {
    factory { AppDispatchers(Dispatchers.Main, Dispatchers.IO) }
    factory { UserRepositoryImpl(get(), get()) as UserRepository }
}