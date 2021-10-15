package com.example.odev1_figma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.odev1_figma.restaurantlist.RecyclerAdapter
import com.example.odev1_figma.restaurantlist.Restaurant
import com.example.odev1_figma.restaurantlist.RestaurantList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter =
            RecyclerAdapter(RestaurantList.getRestaurantItemList() as ArrayList<Restaurant>)
        recyclerView.adapter = adapter



    }
}