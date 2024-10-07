package com.example.taller2_rodrigorojas

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MainActivityScreen(navController: NavController) {
    var name by remember { mutableStateOf("") }
    var savedName by remember { mutableStateOf("") }
    var isLoading by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Ingresa tu nombre") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        Button(
            onClick = { savedName = name },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Guardar Nombre")
        }

        Text(
            text = "Nombre guardado: $savedName",
            fontSize = 20.sp,
            modifier = Modifier.padding(vertical = 16.dp)
        )

        Button(
            onClick = {
                isLoading = true
                simulateNetworkOperation {
                    isLoading = false
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Iniciar Tarea en Segundo Plano")
        }

        if (isLoading) {
            CircularProgressIndicator(modifier = Modifier.padding(top = 16.dp))
        }
    }
}

fun simulateNetworkOperation(onComplete: () -> Unit) {
    // Simula una operación de red con un retraso de 3 segundos
    Thread {
        Thread.sleep(3000)
        onComplete()
    }.start()
}