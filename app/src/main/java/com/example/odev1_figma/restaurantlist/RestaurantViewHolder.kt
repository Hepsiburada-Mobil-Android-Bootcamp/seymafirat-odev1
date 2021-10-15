package com.example.odev1_figma.restaurantlist

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.odev1_figma.R

class RestaurantViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView){
            fun bindItems(restaurant: Restaurant){
                val resName : TextView = itemView.findViewById(R.id.res_name)
                val resNumber : TextView = itemView.findViewById(R.id.res_number)
                val kitchenName : TextView = itemView.findViewById(R.id.res_type)
                val minutes : TextView = itemView.findViewById(R.id.res_time)
                val sale : TextView = itemView.findViewById(R.id.res_sale)
                val image : ImageView = itemView.findViewById(R.id.res_img)

                resName.text = restaurant.restaurantName
                resNumber.text = restaurant.number
                kitchenName.text = restaurant.kitchenName
                minutes.text = restaurant.minutes
                sale.text = restaurant.sale
                image.setImageResource(restaurant.image)
            }





        }