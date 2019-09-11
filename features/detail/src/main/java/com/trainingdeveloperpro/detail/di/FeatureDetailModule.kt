package io.philippeboisney.detail.di


import com.trainingdeveloperpro.detail.DetailImageViewModel
import com.trainingdeveloperpro.detail.DetailViewModel
import com.trainingdeveloperpro.detail.domain.GetUserDetailUseCase
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val featureDetailModule = module {
    factory { GetUserDetailUseCase(get()) }
    viewModel { DetailViewModel(get(), get()) }
    viewModel { DetailImageViewModel() }
}