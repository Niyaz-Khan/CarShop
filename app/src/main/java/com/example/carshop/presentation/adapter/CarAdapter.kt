package com.example.carshop.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.carshop.R
import com.example.carshop.presentation.adapter.CarDiffCallBack
import com.example.domain.models.Car

class CarAdapter() : ListAdapter<Car, CarAdapter.CarViewHolder>(CarDiffCallBack()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): CarViewHolder {
        //преобразует XML макет в объект VIEW. Он "надувает" (inflate) XML-разметку в иерархию View-объектов, которые можно использовать в коде.
        return CarViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_auto, parent, false)
        )
    }

    override fun onBindViewHolder(
        holder: CarViewHolder,
        position: Int,
    ) { //позиция объектов (в данном случае по порядку)
        holder.bind(getItem(position))
    }

    class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val carName: TextView = itemView.findViewById(R.id.carNameTextView)
        private val carPrice: TextView = itemView.findViewById(R.id.carPriceTextView)
        private val carPhoto: ImageView = itemView.findViewById(R.id.imageCar)
        private val carDescription: TextView = itemView.findViewById(R.id.carDescriptionTextView)

        fun bind(car: Car) =
            with(itemView) {  // Принимает Car и заполняет данными имя,цена,объяснения
                carName.text = car.carName
                carPrice.text = car.carPrice
                carDescription.text = car.carDescription

                Glide.with(itemView.context)
                    .load(car.carPhoto)
                    .into(carPhoto)
            }
    }
}