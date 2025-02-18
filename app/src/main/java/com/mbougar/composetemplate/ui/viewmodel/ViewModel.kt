package com.mbougar.composetemplate.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mbougar.composetemplate.data.model.ApiResponse
import com.mbougar.composetemplate.data.remote.RetrofitInstance
import com.mbougar.composetemplate.data.repository.ApiRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.io.IOException

class ViewModel : ViewModel() {
    private val repository = ApiRepository(RetrofitInstance.api)

    private val _dogImage = MutableStateFlow<ApiResponse?>(null)
    val dogImage: StateFlow<ApiResponse?> get() = _dogImage

    fun fetchRandomDog() {
        viewModelScope.launch {
            try {
                val response = repository.getRandomDog()
                _dogImage.value = response
                println(response)
            } catch (e: IOException) { // possible network error
                e.printStackTrace()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}