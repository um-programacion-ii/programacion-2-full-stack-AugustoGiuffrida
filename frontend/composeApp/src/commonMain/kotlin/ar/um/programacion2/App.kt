package ar.um.programacion2

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import ar.um.programacion2.screens.MainNavigationScreen
import cafe.adriel.voyager.navigator.Navigator
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Navigator(
            screen = MainNavigationScreen()
        )
    }
}