package com.mbougar.composetemplate.data.remote

import com.mbougar.composetemplate.data.model.ApiResponse
import retrofit2.http.GET

interface ApiService {
    @GET("breeds/image/random")
    suspend fun getRandomDog(): ApiResponse
}