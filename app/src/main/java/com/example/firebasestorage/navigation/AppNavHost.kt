package com.example.firebasestorage.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.ui.theme.screens.about.About
import com.example.firebasestorage.ui.theme.screens.clothing.ClothingScreen
import com.example.firebasestorage.ui.theme.screens.contact.Contact
import com.example.firebasestorage.ui.theme.screens.home.HomeScreen
import com.example.firebasestorage.ui.theme.screens.services.Services
import com.example.firebasestorage.ui.theme.screens.signup.SignupScreen
import com.example.firebasestorage.ui.theme.screens.splash.SplashScreen
import com.example.firebasestorage.ui.theme.screens.upload.UploadScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController:NavHostController = rememberNavController(), startDestination:String = ROUT_LOGIN) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }


        composable(ROUT_SIGNUP) {
            SignupScreen(navController)
        }

        composable(ROUT_UPLOAD) {
            UploadScreen(navController)
        }
        composable(ROUT_ABOUT) {
            About(navController)
        }
        composable(ROUT_CONTACT) {
            Contact(navController)
        }
        composable(ROUT_SERVICES) {
            Services(navController)}
        composable(ROUT_CLOTHING) {
            ClothingScreen(navController)
        }
        composable(ROUT_LOGIN) {
            SplashScreen(navController)
        }
    }
}