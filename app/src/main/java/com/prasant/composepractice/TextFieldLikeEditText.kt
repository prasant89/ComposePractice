package com.prasant.composepractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue

class TextFieldLikeEditText : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent(){
            LayoutForTextField()
        }
    }
    @Composable
    fun LayoutForTextField(){
        var valueOfField by remember {
            mutableStateOf(TextFieldValue(""))
        }
       Box(
           modifier = Modifier.fillMaxWidth().fillMaxSize(),
           contentAlignment = Alignment.Center
       ){
           TextField( value = valueOfField, onValueChange = {
               valueOfField = it
           }, readOnly = false, label = { Text(text="Name") },
               placeholder = {
                   Text( text = "Enter Your Name")},
               singleLine = true,
               maxLines = 120,
               leadingIcon ={ Icon(Icons.Default.Person, contentDescription = null) },
               trailingIcon ={ Icon(Icons.Default.Add, contentDescription = null) })
    }}
}