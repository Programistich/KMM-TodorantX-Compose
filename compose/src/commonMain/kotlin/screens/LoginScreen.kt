package screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import navigation.NavigationGraph
import ru.alexgladkov.odyssey.compose.extensions.push
import ru.alexgladkov.odyssey.compose.local.LocalRootController

@Composable
fun LoginScreen() {
    val rootController = LocalRootController.current
    Column {
        Text("login screen")
        Button(onClick = {
            rootController.push(NavigationGraph.MAIN.name)
        }) {
            Text("go to main")
        }
    }
}
