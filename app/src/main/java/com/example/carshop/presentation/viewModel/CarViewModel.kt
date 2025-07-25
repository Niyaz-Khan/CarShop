package com.example.carshop.presentation.viewModel


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.models.Car
import com.example.domain.useCase.GetCarUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CarViewModel @Inject constructor(
    private val getCarUseCase: GetCarUseCase,
) : ViewModel() {

    private val _cars = MutableLiveData<List<CarUIModel>>()
    val cars: LiveData<List<CarUIModel>> get() = _cars

    fun loadCars() {
        viewModelScope.launch {
            _cars.value = getCarUseCase.execute().map { car ->
                CarUIModel(
                    carName = car.carName,
                    carDescription = car.carDescription,
                    carPrice = car.carPrice,
                    carPhoto = car.carPhoto
                )
            }
        }
    }
}