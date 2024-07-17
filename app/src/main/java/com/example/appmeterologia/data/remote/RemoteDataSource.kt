package com.example.appmeterologia.data.remote

import com.example.appmeterologia.data.remote.response.WeatherDataResponse

interface RemoteDataSource {

    suspend fun getWeatherDataResponse(lat: Float, lng: Float): WeatherDataResponse
}