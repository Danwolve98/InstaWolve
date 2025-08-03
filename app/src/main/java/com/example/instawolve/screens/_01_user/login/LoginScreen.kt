package com.example.instawolve.screens._01_user.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.instawolve.R
import com.example.instawolve.ui.theme.InstaWolveTheme

@Preview
@Composable
fun LoginScreen(onNavClick : (() -> Unit) ? = null) {
    var user by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    InstaWolveTheme {
        Scaffold { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .padding(horizontal = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = Modifier.padding(top = 10.dp),
                    text = "Español (España)",
                    color = MaterialTheme.colorScheme.onBackground
                )
                Spacer(Modifier.weight(0.8f))
                Image(
                    modifier = Modifier
                        .size(80.dp)
                        .clip(RoundedCornerShape(20.dp)),
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "Instawolve logo",
                    contentScale = ContentScale.Crop,

                    )
                Spacer(Modifier.weight(0.8f))
                OutlinedTextField(modifier = Modifier.fillMaxWidth(),value = user, onValueChange = {
                    user = it
                }, label = {
                    Text("Usuario, correo electrónico o móvil", fontSize = 14.sp)
                }, shape = RoundedCornerShape(20.dp))
                Spacer(Modifier.height(5.dp))
                OutlinedTextField(modifier = Modifier.fillMaxWidth(), value = password, onValueChange = {
                    password = it
                }, label = {
                    Text("Contraseña", fontSize = 14.sp)
                }, shape = RoundedCornerShape(20.dp))
                Spacer(Modifier.height(5.dp))
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {}){
                    Text("Iniciar sesión")
                }
                Text(
                    "¿Has olvidado tu contraseña?",
                    color = MaterialTheme.colorScheme.onBackground,
                    fontSize = 12.sp
                )
                Spacer(Modifier.weight(1f))
                OutlinedButton(modifier = Modifier.fillMaxWidth(),onClick = {
                    onNavClick?.invoke()
                }, border = BorderStroke(1.dp,Color.Blue)) {
                    Text("Crear cuenta nueva", color = Color.Blue)
                }
                AsyncImage(
                    modifier = Modifier.fillMaxWidth().aspectRatio(35f/3f),
                    model = "https://cdn.pixabay.com/photo/2021/12/06/13/45/meta-6850393_960_720.png",
                    contentDescription = "meta logo",
                    colorFilter = ColorFilter.tint(Color.Gray))
            }
        }
    }
}