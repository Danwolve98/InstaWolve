package com.example.instawolve

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.instawolve.nav.NavWrapper
import com.example.instawolve.ui.theme.InstaWolveTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InstaWolveTheme {
                NavWrapper()
            }
        }
    }
}