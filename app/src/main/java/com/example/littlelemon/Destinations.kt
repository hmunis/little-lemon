package com.example.littlelemon

sealed class Destinations(val route: String) {
    object Home: Destinations(route = "Home")
    object Profile: Destinations(route = "Profile")
    object Onboarding: Destinations(route = "Onboarding")
}