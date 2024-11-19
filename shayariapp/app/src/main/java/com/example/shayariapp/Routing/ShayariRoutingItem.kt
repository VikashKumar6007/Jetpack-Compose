package com.example.shayariapp.Routing

sealed class ShayariRoutingItem(val route : String) {
    object splashscreen : ShayariRoutingItem("splash")
    object categoryscreen : ShayariRoutingItem("category")
    object shayariListScreen : ShayariRoutingItem("shayari_list")
    object finalShayariScreen : ShayariRoutingItem("final_shayari_view")
}