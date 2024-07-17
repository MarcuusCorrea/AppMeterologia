package com.example.appmeterologia.data

import com.example.appmeterologia.data.remote.RemoteDataSource
import com.example.appmeterologia.data.remote.response.WeatherDataResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import javax.inject.Inject


class KtorRemoteDataSource @Inject constructor(
        private val httpClient: HttpClient
    ) : RemoteDataSource {

        companion object {
            private const val BASE_URL = "https://api.openweathermap.org/data/2.5"
        }

        override suspend fun getWeatherDataResponse(lat: Float, lng: Float): WeatherDataResponse {
            return httpClient
                .get("${BASE_URL}/weather?lat=$lat&lon=$lng&appid=d49b09e5055ee257803c3d6cb9d670d3")
                .body()
        }

    }