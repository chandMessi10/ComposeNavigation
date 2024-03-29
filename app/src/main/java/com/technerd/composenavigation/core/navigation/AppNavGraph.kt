package com.technerd.composenavigation.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.technerd.composenavigation.feature.auth.presentation.LogInScreen
import com.technerd.composenavigation.feature.auth.presentation.SignUpScreen

@Composable
fun AppNavGraph(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = Screen.LogIn.route) {
        composable(route = Screen.LogIn.route) {
            LogInScreen(navHostController = navHostController)
        }
        composable(route = Screen.SignUp.route) {
            SignUpScreen()
        }
    }
}