package navigation

import ru.alexgladkov.odyssey.compose.extensions.screen
import ru.alexgladkov.odyssey.compose.navigation.RootComposeBuilder
import screens.LoginScreen
import screens.MainScreen
import screens.SplashScreen

fun RootComposeBuilder.generateGraph() {
    screen(name = NavigationGraph.SPLASH.name) {
        SplashScreen()
    }
    screen(name = NavigationGraph.LOGIN.name) {
        LoginScreen()
    }
    screen(name = NavigationGraph.MAIN.name) {
        MainScreen()
    }
}

enum class NavigationGraph {
    SPLASH,
    LOGIN,
    MAIN
}

val START_SCREEN = NavigationGraph.SPLASH.name
const val APP_NAME = "TodorantX"