package com.example.weather

data class DayItem(
    val city: String,
    val time: String,
    val condition:String,
    val imageUrl: String,
    val current: String,
    val maxTemp: String,
    val minTemp: String,
    val hours: String
)
