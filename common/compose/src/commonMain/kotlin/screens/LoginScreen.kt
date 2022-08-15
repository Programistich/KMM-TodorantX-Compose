package screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import ru.alexgladkov.odyssey.compose.extensions.push
import ru.alexgladkov.odyssey.compose.local.LocalRootController

@Composable
fun LoginScreen() {
    val rootController = LocalRootController.current
    Column {
        Text("login screen")
        Button(onClick = {
            rootController.push("main")
        }) {
            Text("go to main")
        }
    }
}
