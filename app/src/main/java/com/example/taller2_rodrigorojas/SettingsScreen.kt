package com.example.taller2_rodrigorojas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun SettingsScreen(navController: NavController) {
    var backgroundColor by remember { mutableStateOf(Color.White) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Configuración", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { backgroundColor = Color.Red },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Cambiar Fondo a Rojo")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { backgroundColor = Color.Green },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Cambiar Fondo a Verde")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { backgroundColor = Color.Blue },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Cambiar Fondo a Azul")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { navController.navigate("home_screen") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Volver a la Pantalla de Inicio")
        }
    }
}