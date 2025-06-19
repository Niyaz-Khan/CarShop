package com.example.carshop

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class CarAdapter(private var cars: List<Car>): RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): CarViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_auto, parent, false)
        return CarViewHolder(view)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.bind(cars[position])
    }

    override fun getItemCount(): Int = cars.size


    class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val carName: TextView = itemView.findViewById(R.id.carNameTextView)
        private val carPrice: TextView = itemView.findViewById(R.id.carPriceTextView)
        private val carPhoto: ImageView = itemView.findViewById(R.id.imageCar)
        private val carDescription: TextView = itemView.findViewById(R.id.carDescriptionTextView)

        fun bind(car: Car) {
            carName.text = car.carName
            carPrice.text = car.carPrice
            carDescription.text = car.carDescription

            Glide.with(itemView.context)
                .load(car.carPhoto)
                .into(carPhoto)
        }
    }
}