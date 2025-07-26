package com.example.carshop.dI

import com.example.domain.repository.CarRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import data.repository.CarNetworkSource
import data.repository.CarRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    @Singleton
    fun provideCarRepository(carNetworkSourse: CarNetworkSource): CarRepository = CarRepositoryImpl(carNetworkSource = carNetworkSourse)
}