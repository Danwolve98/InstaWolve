package com.example.instawolve.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.instawolve.screens._01_user.login.LoginScreen
import com.example.instawolve.screens._01_user.login.RegisterScreen

@Composable
fun NavWrapper() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Login) {
        composable<Login>{
            LoginScreen{
                navController.navigate(Register)
            }
        }
        composable<Register> {
            RegisterScreen(onBackNavClick ={ navController.navigateUp()})
        }
    }
}