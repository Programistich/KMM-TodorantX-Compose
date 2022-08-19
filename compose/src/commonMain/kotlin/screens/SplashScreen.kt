package screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import navigation.NavigationGraph
import ru.alexgladkov.odyssey.compose.extensions.push
import ru.alexgladkov.odyssey.compose.local.LocalRootController

@Composable
fun SplashScreen() {
    val rootController = LocalRootController.current
    Column {
        Text("Splash screen")
        Button(onClick = {
            rootController.push(NavigationGraph.LOGIN.name)
        }) {
            Text("go to login")
        }
    }
//    StoredViewModel(factory = { SplashViewModel() }) { viewModel ->
//        val rootController = LocalRootController.current
//        val actions by viewModel.viewActions().observeAsState()
//
//        val scale = remember { Animatable(0f) }
//        LaunchedEffect(key1 = true) {
//            scale.animateTo(
//                targetValue = 1f,
//                animationSpec = tween(durationMillis = 500)
//            )
//        }
//        Box(
//            modifier = Modifier.fillMaxSize(),
//            contentAlignment = Alignment.Center
//        ) {
//            Text("Ahah its Splash screen, because i cant implementation image in KMM")
//        }
//
//        LaunchedEffect(key1 = actions) {
//            when (actions) {
//                is SplashAction.NavigateToLogin -> rootController.push(NavigationGraph.LOGIN.name)
//                is SplashAction.NavigateToMain -> rootController.push(NavigationGraph.MAIN.name)
//                null -> {}
//            }
//        }
//    }
}

//fun bitmapResource(path: String): ImageBitmap {
//    return Image.makeFromEncoded(byteArrayOf()).toComposeImageBitmap()
//}
//
//class SplashViewModel : BaseSharedViewModel<Unit, SplashAction, SplashEvent>(initialState = Unit) {
//    override fun obtainEvent(viewEvent: SplashEvent) {
//        when (viewEvent) {
//            is SplashEvent.EntryDisplay -> {}
//        }
//    }
//}
//
//sealed class SplashEvent {
//    object EntryDisplay : SplashEvent()
//}
//
//sealed class SplashAction {
//    object NavigateToLogin : SplashAction()
//    object NavigateToMain : SplashAction()
//}
