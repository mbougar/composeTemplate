package com.mbougar.composetemplate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mbougar.composetemplate.ui.view.MainScreen
import com.mbougar.composetemplate.ui.viewmodel.ViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val viewModel = ViewModel()

        super.onCreate(savedInstanceState)
        setContent {
            MainScreen(viewModel)
        }
    }
}