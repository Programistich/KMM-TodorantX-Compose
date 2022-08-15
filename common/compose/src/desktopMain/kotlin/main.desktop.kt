import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ProvidedValue
import androidx.compose.ui.awt.ComposePanel
import navigation.NAME
import navigation.START_SCREEN
import navigation.generateGraph
import ru.alexgladkov.odyssey.compose.base.Navigator
import ru.alexgladkov.odyssey.compose.local.LocalRootController
import ru.alexgladkov.odyssey.compose.navigation.RootComposeBuilder
import ru.alexgladkov.odyssey.compose.navigation.modal_navigation.ModalNavigator
import java.awt.BorderLayout
import javax.swing.JFrame
import javax.swing.SwingUtilities
import javax.swing.WindowConstants

fun main() = SwingUtilities.invokeLater {
    val window = JFrame()
    window.title = NAME
    window.setSize(800, 600)

    window.setupNavigation(START_SCREEN) {
        generateGraph()
    }
}

fun JFrame.setupNavigation(
    startScreen: String,
    vararg providers: ProvidedValue<*>,
    navigationGraph: RootComposeBuilder.() -> Unit
) {
    val composePanel = ComposePanel()
    composePanel.setContent {
        val rootController = RootComposeBuilder().apply(navigationGraph).build()

        CompositionLocalProvider(
            *providers,
            LocalRootController provides rootController
        ) {
            ModalNavigator {
                Navigator(startScreen)
            }
        }
    }
    defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
    contentPane.add(composePanel, BorderLayout.CENTER)
    setLocationRelativeTo(null)
    isVisible = true
}
