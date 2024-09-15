package com.prasant.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class BoxLayoutLikeFrameLayout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BoxLayout()
        }
    }

    @Composable
    fun BoxLayout() {
        Box(modifier = Modifier.fillMaxSize().background(Color.LightGray), contentAlignment = Alignment.Center) {
            Text(
                text = " Make your subjects and verbs ",
                color = Color.Magenta,
                fontSize = 18.sp,
                modifier = Modifier.align(
                    Alignment.TopStart
                )
            )
            Text(
                fontSize = 18.sp,
                text = " Capitalize where needed ", color = Color.Cyan, modifier = Modifier.align(
                    Alignment.CenterEnd
                )
            )
            Text(
                fontSize = 22.sp,
                text = " Use complete sentences ", color = Color.Yellow, modifier = Modifier.align(
                    Alignment.TopEnd
                )
            )
        }
    }
}