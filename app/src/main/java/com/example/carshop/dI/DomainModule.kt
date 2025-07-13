package com.example.carshop.dI

import com.example.domain.repository.CarRepository
import com.example.domain.useCase.GetCarUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    fun provideGetCarUseCase(carRepository: CarRepository): GetCarUseCase {
        return GetCarUseCase(carRepository = carRepository)
    }
}