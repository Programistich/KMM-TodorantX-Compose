package com.programistich.todorantx

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import navigation.NavigationGraph
import navigation.generateGraph
import ru.alexgladkov.odyssey.compose.setupNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setupNavigation(NavigationGraph.SPLASH.name) {
                generateGraph()
            }
        }
    }
}
