package com.example.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val foodList = arrayListOf("Hot Dog", "pizza", "Kebab", "Hamburger")
        decideBtn.setOnClickListener {
            val randomFoodIndex = java.util.Random().nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFoodIndex]
        }
        addBtn.setOnClickListener {
            val food = addFoodTxt.text.toString()
            foodList.add(food)
            addFoodTxt.text.clear()
        }
    }
}