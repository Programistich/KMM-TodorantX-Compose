import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.window.Window
import platform.AppKit.NSApp
import platform.AppKit.NSApplication
import ru.alexgladkov.odyssey.compose.local.LocalRootController

fun main() {
    NSApplication.sharedApplication()
    Window("TodorantX") {
        CompositionLocalProvider(
            LocalRootController provides rootController
        ) {
            ModalNavigator {
                Navigator(start)
            }
        }
    }
    NSApp?.run()
}
