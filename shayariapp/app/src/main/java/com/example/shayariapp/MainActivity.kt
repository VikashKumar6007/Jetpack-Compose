package com.example.shayariapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.shayariapp.Routing.ShayariRouting
import com.example.shayariapp.ui.theme.ShayariappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            ShayariappTheme {
//                SplashScreen()
                val navHostController = rememberNavController()
                ShayariRouting(navHostController)
            }
        }
    }
}

