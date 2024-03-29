package com.technerd.composenavigation.core.navigation

sealed class Screen (val route: String) {
    object LogIn: Screen("login_screen")
    object SignUp: Screen("sign_up_screen")
}