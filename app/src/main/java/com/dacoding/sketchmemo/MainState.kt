package com.dacoding.sketchmemo


import android.util.Size
import com.dacoding.sketchmemo.composables.Line

data class MainState(
    val lines: List<Line> = emptyList(),
    val canvasSize: Size = Size(0, 0)
)
