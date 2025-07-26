package com.example.carshop.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.carshop.presentation.viewModel.CarUIModel
import com.example.domain.models.Car

class CarDiffCallBack: DiffUtil.ItemCallback<CarUIModel> (){
    override fun areItemsTheSame(
        oldItem: CarUIModel,
        newItem: CarUIModel,
    ): Boolean { // проверка на идентичность
        return oldItem.carName == newItem.carName
    }

    override fun areContentsTheSame(
        oldItem: CarUIModel,
        newItem: CarUIModel,
    ): Boolean { // Проверка на изменение содержимого элементов
        return oldItem == newItem
    }
}