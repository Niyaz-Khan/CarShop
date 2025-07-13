package com.example.domain.useCase

import com.example.domain.models.Car
import com.example.domain.repository.CarRepository

class GetCarUseCase (
    private val carRepository: CarRepository // Интерфейс из Domain
    ) {
        suspend fun execute(): List<Car> {
            return carRepository.getCars() // Реализация в Data
        }
}