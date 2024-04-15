package com.example.elimuapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.elimuapp.ui.theme.screens.about.About
import com.example.elimuapp.ui.theme.screens.clothing.ClothingScreen
import com.example.elimuapp.ui.theme.screens.dashboard.DashboardScreen
import com.example.elimuapp.ui.theme.screens.home.HomeScreen
import com.example.elimuapp.ui.theme.screens.login.LoginScreen
import com.example.elimuapp.ui.theme.screens.services.Services
import com.example.elimuapp.ui.theme.screens.signup.SignupScreen
import com.example.elimuapp.ui.theme.screens.splash.SplashScreen
import com.example.elimuapp.ui.theme.screens.upload.UploadScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController:NavHostController = rememberNavController(), startDestination:String = ROUT_SPLASH) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUT_HOME) {

            HomeScreen(navController)
        }

        composable(ROUT_LOGIN){
            LoginScreen(navController)
        }

        composable(ROUT_SIGNUP){
            SignupScreen(navController)
        }

        composable(ROUT_UPLOAD){
            UploadScreen(navController)
        }
        composable(ROUT_DASHBOARD){
            DashboardScreen(navController)
        }
        composable(ROUT_SPLASH){
            SplashScreen(navController)
        }
        composable(ROUT_ABOUT){
            About(navController)
        }
        composable(ROUT_SERVICES){
            Services(navController)
        }
        composable(ROUT_CLOTHING){
            ClothingScreen(navController)
        }
    }
}