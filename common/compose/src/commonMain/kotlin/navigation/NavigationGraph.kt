package navigation

import ru.alexgladkov.odyssey.compose.extensions.screen
import ru.alexgladkov.odyssey.compose.navigation.RootComposeBuilder
import screens.LoginScreen
import screens.MainScreen
import screens.SplashScreen

fun RootComposeBuilder.generateGraph() {
    screen(name = "splash") {
        SplashScreen()
    }
    screen(name = "login") {
        LoginScreen()
    }
    screen(name = "main") {
        MainScreen()
    }
}

const val START_SCREEN = "splash"
const val NAME = "TodorantX"