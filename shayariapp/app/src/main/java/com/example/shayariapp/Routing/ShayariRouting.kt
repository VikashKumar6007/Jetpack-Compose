package com.example.shayariapp.Routing

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.shayariapp.CategoryScreen
import com.example.shayariapp.FinalShayariView
import com.example.shayariapp.ShayariListScreen.ShayariListScreen
import com.example.shayariapp.SplashScreen

@Composable
fun ShayariRouting(navHostController: NavHostController) {
    
    NavHost(navController =navHostController , startDestination = ShayariRoutingItem.splashscreen.route)
    {
         composable(ShayariRoutingItem.categoryscreen.route){
             CategoryScreen(navHostController)
         }
        composable(ShayariRoutingItem.splashscreen.route){
            SplashScreen(navHostController)
        }

        composable(ShayariRoutingItem.shayariListScreen.route + "/{title}"){
            val title = it.arguments?.getString("title")
            ShayariListScreen(navHostController ,title)
        }
        composable(ShayariRoutingItem.finalShayariScreen.route + "/{item}"){
            val item = it.arguments?.getString("item")
            FinalShayariView(item)
        }

    }
}