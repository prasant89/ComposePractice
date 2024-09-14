package com.prasant.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle

class LayoutTypes : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {
            LinearLayoutDisply()
        }
    }

    @Composable
    fun LinearLayoutDisply() {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text(
                text = "Prasant Kumar Pradhan",
                color = Color.Red,
                fontStyle = FontStyle.Italic,
                modifier = Modifier.align(
                    Alignment.TopStart
                )
            )
            Text(
                text = "Sitaram Sahoo",
                color = Color.Blue,
                fontStyle = FontStyle.Normal,
                modifier = Modifier.align(
                    Alignment.TopEnd
                )
            )
            Text(
                text = "Nuagaon Bagdia",
                color = Color.Magenta,
                fontStyle = FontStyle.Italic,
                modifier = Modifier.align(
                    Alignment.BottomCenter
                )
            )
            Text(
                text = "Angul Odisha",
                color = Color.Cyan,
                fontStyle = FontStyle.Normal,
                modifier = Modifier.align(
                    Alignment.BottomStart
                )
            )

            Text(
                text = "Nuagaon Bagdia",
                color = Color.Magenta,
                fontStyle = FontStyle.Italic,
                modifier = Modifier.align(
                    Alignment.CenterStart
                )
            )
        }
    }
}