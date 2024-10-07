package com.example.taller2_rodrigorojas

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home_screen") {
        composable("home_screen") { HomeScreen(navController) }
        composable("main_activity_screen") { MainActivityScreen(navController) }
        composable("settings_screen") { SettingsScreen(navController) }
    }
}