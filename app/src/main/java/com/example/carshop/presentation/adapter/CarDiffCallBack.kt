package com.example.carshop.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.domain.models.Car

class CarDiffCallBack: DiffUtil.ItemCallback<Car> (){
    override fun areItemsTheSame(
        oldItem: Car,
        newItem: Car,
    ): Boolean { // проверка на идентичность
        return oldItem.carName == newItem.carName
    }

    override fun areContentsTheSame(
        oldItem: Car,
        newItem: Car,
    ): Boolean { // Проверка на изменение содержимого элементов
        return oldItem == newItem
    }
}