package com.prasant.composepractice

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class CardLayout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {
            CardLayout()
        }
    }

    @SuppressLint("NotConstructor")
    @Composable
    fun CardLayout() {
        Card(modifier = Modifier.padding(8.dp).fillMaxWidth(), shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 10.dp)) {
            Column(modifier = Modifier
                .padding(30.dp)
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
                .clickable(onClick = { "After clicking"} )
                .clip(shape = RoundedCornerShape(16.dp)),) {
            Image(
                painter = painterResource(id = R.drawable.my_pic),
                contentDescription = null,
                modifier = Modifier.padding(8.dp).fillMaxWidth()
                    .clip(RoundedCornerShape(CornerSize(120.dp))))
            Text(text = "Prasant Kumar Pradhan", color = Color.Magenta,
                fontSize = 16.sp, fontFamily = FontFamily.SansSerif,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth())
            }
        }
    }
}