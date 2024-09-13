package com.prasant.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.core.view.WindowCompat
import com.prasant.composepractice.ui.theme.ComposePracticeTheme
import com.prasant.composepractice.util.HomeUI

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        WindowCompat.setDecorFitsSystemWindows(window, true)
        setContent {
            ComposePracticeTheme {
                window?.statusBarColor = Color.LightGray.toArgb()
                Surface ( modifier = Modifier.fillMaxSize(              ),
                color = MaterialTheme.colorScheme.background)           {
                  HomeUI()
                }
            }
        }
    }
}

