package com.technerd.composenavigation.feature.auth.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.technerd.composenavigation.core.navigation.Screen

@Composable
fun LogInScreen(navHostController: NavHostController) {
    Column {
        Text("Welcome to Login Screen")

        Button(onClick = {
            navHostController.navigate(Screen.SignUp.route)
        }) {
            Text("Sign Up")
        }
    }
}