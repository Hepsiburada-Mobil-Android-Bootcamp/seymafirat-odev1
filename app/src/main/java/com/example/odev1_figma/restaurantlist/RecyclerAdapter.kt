package com.example.odev1_figma.restaurantlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.odev1_figma.R

class RecyclerAdapter(val restaurantList : ArrayList<Restaurant>):
    RecyclerView.Adapter<RestaurantViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        return RestaurantViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_restaurants,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return restaurantList.size
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        holder.bindItems(restaurantList[position])
    }
    }

