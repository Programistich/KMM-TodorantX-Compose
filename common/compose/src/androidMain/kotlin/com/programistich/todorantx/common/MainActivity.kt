package com.programistich.todorantx.common

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import navigation.START_SCREEN
import navigation.generateGraph
import ru.alexgladkov.odyssey.compose.setupNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setupNavigation(START_SCREEN) {
                generateGraph()
            }
        }
    }
}