package com.example.instawolve.screens._01_user.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instawolve.R
import com.example.instawolve.ui.theme.InstaWolveTheme

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun RegisterScreen(onNavClick: (() -> Unit)? = null,onBackNavClick: (() -> Unit)? = null) {
    var movil by remember { mutableStateOf("") }

    InstaWolveTheme {
        Scaffold(topBar = {
            TopAppBar(
                title = {
                    Text("")
                }, navigationIcon = {
                    Icon(modifier = Modifier.clickable(onClick = {
                        onBackNavClick?.invoke()
                    }),
                        painter = painterResource(R.drawable.outline_arrow_back_24),
                        contentDescription = "Flecha de retroceso"
                    )
                })
        }) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .padding(horizontal = 20.dp)
            ) {
                Text(
                    modifier = Modifier.padding(top = 20.dp),
                    text = "¿Cuál es tu número de móvil?",
                    fontSize = 20.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
                Text(
                    modifier = Modifier.padding(top = 5.dp),
                    text = "Introduce tu número de móvil de contacto. Nadie lo verá en tu perfil.",
                    fontSize = 13.sp,
                    lineHeight = 18.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
                OutlinedTextField(
                    movil, { movil = it }, label = {
                    Text("Número de móvil", fontSize = 14.sp)
                }, shape = RoundedCornerShape(20.dp),
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
                )
                Text(
                    modifier = Modifier.padding(top = 10.dp),
                    text = "Puede que recibas notificaciones nuestras en Whatsapp y por SMS por motivos de seguridad y para iniciar sesión.",
                    fontSize = 12.sp,
                    lineHeight = 15.sp,
                    color = MaterialTheme.colorScheme.tertiary
                )
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp),
                    onClick = {}) {
                    Text("Siguiente")
                }
                OutlinedButton(modifier = Modifier.fillMaxWidth(), onClick = {
                    onNavClick?.invoke()
                }, border = BorderStroke(1.dp, Color.Blue)) {
                    Text("Registrarte con tu correo electrónico", color = Color.Blue)
                }
            }
        }
    }
}