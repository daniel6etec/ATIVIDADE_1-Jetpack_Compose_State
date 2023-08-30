package com.example.pam_atividade.telas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun MainScreen(){
    Column{
        Text(text = "asdfasdf")
        Text("TextoDaMainScreen")
        Row(){
            Button(onClick = { /*TODO*/ }) {
                Text("Navegar para TaskScreen")
            }

        }
    }

}