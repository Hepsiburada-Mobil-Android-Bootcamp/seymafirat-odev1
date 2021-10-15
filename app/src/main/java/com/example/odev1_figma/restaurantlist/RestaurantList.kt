package com.example.odev1_figma.restaurantlist

import com.example.odev1_figma.R
import com.example.odev1_figma.restaurantlist.Restaurant

object RestaurantList {

    fun getRestaurantItemList(): List<Restaurant> {
        val res1 = Restaurant(
            "Conrad food",
            "4.6",
            " • Pizza  •",
            "15 min",
            "50% OFF",
            R.drawable.res1

        )
        val res2 = Restaurant(
            "SK Restro",
            "4.4",
            " • Chienese •",
            "30 min",
            "40% OFF",
            R.drawable.res2
        )
        val res3 = Restaurant(
            "Black Fish",
            "4.3",
            "• Seafood •",
            "20 min",
            "40% OFF",
            R.drawable.res3

        )
        val res4 = Restaurant(
            "Goichi Oniko",
            "4.0",
            "• Fastfood •",
            "20 min",
            "50% OFF",
            R.drawable.res4

        )


        val restaurantList: ArrayList<Restaurant> = ArrayList()
        restaurantList.add(res1)
        restaurantList.add(res2)
        restaurantList.add(res3)
        restaurantList.add(res4)
        return restaurantList
    }

}