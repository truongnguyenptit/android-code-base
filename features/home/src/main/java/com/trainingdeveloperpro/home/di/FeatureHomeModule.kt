package com.trainingdeveloperpro.home.di

import com.trainingdeveloperpro.home.HomeViewModel
import com.trainingdeveloperpro.home.domain.GetTopUsersUseCase
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val featureHomeModule = module {
    factory { GetTopUsersUseCase(get()) }
    viewModel { HomeViewModel(get(), get()) }
}