package io.philippeboisney.archapp.di

import com.trainingdeveloperpro.home.di.featureHomeModule
import com.trainingdeveloperpro.local.di.localModule
import com.trainingdeveloperpro.remote.di.createRemoteModule
import com.trainingdeveloperpro.repository.di.repositoryModule
import io.philippeboisney.detail.di.featureDetailModule


val appComponent= listOf(createRemoteModule("https://api.github.com/"), repositoryModule, featureHomeModule, featureDetailModule, localModule)