package com.example.instawolve.screens._01_user.login

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.instawolve.ui.theme.InstaWolveTheme
import kotlin.time.Instant

@Preview
@Composable
fun MyPreview() {
    InstaWolveTheme {
        Scaffold { padding ->
            MyBox(Modifier.padding(padding))
        }
    }
}

@Composable
fun MyBox(modifier: Modifier) {
    Button(
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.Unspecified
        ),
        onClick = {

    }) {
        DaniText(color = Color.Unspecified)
    }


}

@Composable
fun DaniText(color : Color = Color.Blue) {
    Text("hoLA QUE TAL", color = color)

}