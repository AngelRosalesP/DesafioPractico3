package com.example.desafiopractico3.api

import com.example.desafiopractico3.model.Weather
import com.example.desafiopractico3.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("weather/Soyapango")
    suspend fun getWeather(): Response<Weather>
}