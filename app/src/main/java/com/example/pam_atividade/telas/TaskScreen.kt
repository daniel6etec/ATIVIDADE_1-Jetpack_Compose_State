package com.example.pam_atividade.telas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun TaskScreen(){

    //var vlrDoTextField: String = "VlrInicial"
    val vlrDoTextField = remember {
        mutableStateOf("vlrInicial")
    }

    val contador = remember {
        mutableStateOf(0)
    }

    Column (modifier = Modifier.padding(20.dp)){
        Text(text = "Titulo da Tarefa")
        TextField(value = vlrDoTextField.value, onValueChange = {
            //Antes da tela ser redesenhada
            //roda esse trecho de codigo aqui...
            vlrDoTextField.value = it
            Log.i("### fun TaskScreen(){...", it)
        })
        Spacer(modifier = Modifier.width(20.dp))
        Text(vlrDoTextField.value)
        Button(onClick = { /*TODO*/ }) {
            Text("Navegar para MainScreen")
        }

        Button(onClick = {
            contador.value = contador.value + 1
        }) {
            Text("Incrementar Contador")
        }

        Text(contador.value.toString())

    }
}