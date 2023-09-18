package com.dacoding.sketchmemo.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.dacoding.sketchmemo.presentation.composables.DrawingCanvas

@Composable
fun DrawingScreen() {
    Column {
        DrawingCanvas()
    }
}