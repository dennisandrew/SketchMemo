package com.dacoding.sketchmemo

import android.util.Size
import com.dacoding.sketchmemo.composables.Line

sealed class MainEvent {
    data class Save(val lines: List<Line>, val canvasSize: Size) : MainEvent()
}
