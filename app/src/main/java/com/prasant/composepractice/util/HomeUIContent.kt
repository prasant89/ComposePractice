package com.prasant.composepractice.util

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale.Companion.Crop
import androidx.compose.ui.layout.ContentScale.Companion.FillBounds
import androidx.compose.ui.layout.ContentScale.Companion.Fit
import androidx.compose.ui.layout.ContentScale.Companion.Inside
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.prasant.composepractice.R
import com.prasant.composepractice.R.color.purple_200
import com.prasant.composepractice.data.Data


@Composable
fun HomeUI() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                Modifier
                    .background(colorResource(id = purple_200))
                    .fillMaxWidth()
                    .height(56.dp)
            ) {
                Buttons(icon = R.drawable.baseline_add_home_24, Color.White)
                Column(
                    modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Peasant Shopping Mall", style = TextStyle(
                            fontSize = 20.sp, color = Color.Magenta, fontWeight = FontWeight.W700
                        )
                    )
                }
                Box(
                    modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd
                ) {
                    Buttons(icon = R.drawable.search)
                }
            }
            Card(modifier = Modifier.fillMaxWidth()) {
                LazyVerticalGrid(columns = GridCells.Fixed(2)) {
                    items(Data.dataList) {
                        ShowHeroin(data = it)
                    }
                }
            }
        }
    }
}

@Composable
fun ShowHeroin(data: Data.Demo) {
    Card(
        onClick = {},
        colors = CardDefaults.cardColors(
            containerColor = Color.Gray, //Card background color
            contentColor = Color.Gray  //Card content color,e.g.text
        ),
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .width(175.dp)
            .height(250.dp)
            .padding(vertical = 5.dp, horizontal = 5.dp)
            .clip(RoundedCornerShape(10))
            .shadow(ambientColor = Color.Blue, elevation = 15.dp)
    ) {
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp, horizontal = 5.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val imageModifier = Modifier
                    .size(130.dp)
                    .background(Color.Gray)
                    .clip(CircleShape)                       // clip to the circle shape
                    .border(2.dp, Color.Green, CircleShape)   // add a border (optional)
                Image(
                    painter = painterResource(id = data.imgage),
                    contentDescription = stringResource(id = R.string.app_name),
                    contentScale = FillBounds,
                    modifier = imageModifier
                )
                Text(
                    text = data.name,
                    style = TextStyle(fontSize = 14.sp),
                    fontWeight = FontWeight.W400,
                    color = Color.Red
                )
                Text(
                    text = data.desc,
                    style = TextStyle(fontSize = 16.sp),
                    fontWeight = FontWeight.W300,
                    color = Color.Magenta
                )
                Text(
                    text = data.price,
                    style = TextStyle(fontSize = 14.sp),
                    fontWeight = FontWeight.W400,
                    color = Color.Black
                )
                Button(
                    onClick = {},
                    modifier = Modifier
                        .width(90.dp),
                    shape = RoundedCornerShape(18.dp),
                    colors = ButtonDefaults.buttonColors(contentColor = Color.Green)
                ) {
                    Text(
                        text = "Add", style = TextStyle(fontSize = 14.sp),
                        fontWeight = FontWeight.W700,
                        color = Color.White,
                    )
                }
            }
        }
    }
}

@Composable
fun Buttons(
    @DrawableRes icon: Int, tint: Color = Color.Unspecified
) {
    IconButton(onClick = {""}) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = " ",
            Modifier.background(tint)
        )
    }
}