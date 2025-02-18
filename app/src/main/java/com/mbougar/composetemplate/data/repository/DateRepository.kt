package com.mbougar.composetemplate.data.repository

import com.mbougar.composetemplate.data.remote.ApiService

class ApiRepository(private val apiService: ApiService) {
    suspend fun getRandomDog() = apiService.getRandomDog()
}