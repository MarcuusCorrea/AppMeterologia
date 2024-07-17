package com.example.appmeterologia.data.Repository

import com.example.appmeterologia.data.Model.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(lat: Float, lng: Float): WeatherInfo
}