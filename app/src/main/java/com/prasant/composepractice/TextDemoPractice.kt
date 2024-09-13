package com.prasant.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class TextDemoPractice : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Row {
                    Text(
                        text = "Prasant How Are You  ",
                        color = Color.Red,
                        fontFamily = FontFamily.SansSerif
                    )
                    Text(
                        text = "I am Fine What about you",
                        color = Color.Magenta,
                        fontSize = 15.sp,
                        fontStyle = FontStyle.Italic
                    )
                }

                Column {
                    Text(
                        text = " I Love My India  ",
                        color = Color.Red,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = " India is the best ",
                        color = Color.Magenta,
                        fontSize = 15.sp,
                        fontStyle = FontStyle.Normal
                    )
                }

                val demoArray =
                    arrayOf("Prasant", "Kumar", "Pradhan", "From", "Telisahi", "Nuagaon")
                demoArray.forEach {
                    Row {
                        Text(
                            text = it.repeat(3),
                            modifier = Modifier
                                .padding(5.dp, 0.dp, 0.dp, 0.dp)
                                .border(
                                    border = BorderStroke(2.dp, Color.Blue),
                                    shape = CutCornerShape(3.dp)
                                )
                        )
                    }
                }
                DisplayLayout()
            }

        }
    }
@Composable
    private fun DisplayLayout() {
        Column (modifier = Modifier.fillMaxWidth().fillMaxHeight().background(Color.DarkGray).shadow(
            elevation = (22.dp)).padding(0.dp,20.dp,0.dp,0.dp),
            horizontalAlignment = Alignment.CenterHorizontally){
            for (i in 0..20){
                Text(text = "Hello Prasant", color = Color.White, fontSize = 16.sp, fontStyle = FontStyle.Italic, textAlign = TextAlign.Justify)
            }
        }
    }
}