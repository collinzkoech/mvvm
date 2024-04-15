package com.example.elimuapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.elimuapp.navigation.AppNavHost
import com.example.elimuapp.ui.theme.FirebasestorageTheme
import com.google.firebase.FirebaseApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FirebaseApp.initializeApp(this)

        setContent {
            FirebasestorageTheme {
                AppNavHost()
            }
        }
    }
}
