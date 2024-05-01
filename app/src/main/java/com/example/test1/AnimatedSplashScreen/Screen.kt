package com.example.test1.AnimatedSplashScreen

sealed class Screen (val route : String) {
    object Splash : Screen("splash_screen")
    object Home : Screen("home_screen")

}