package com.example.domain.repository

import com.example.domain.models.Car

interface CarRepository {
    suspend fun getCars(): List<Car>
}