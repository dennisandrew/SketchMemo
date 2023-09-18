package com.dacoding.sketchmemo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.dacoding.sketchmemo.composables.DrawingCanvas

@Composable
fun DrawingScreen(
) {
    Column(Modifier.fillMaxSize()) {
        DrawingCanvas()
    }
}