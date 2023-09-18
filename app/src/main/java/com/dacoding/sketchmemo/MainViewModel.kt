package com.dacoding.sketchmemo

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.os.Environment
import android.util.Size
import androidx.lifecycle.ViewModel
import com.dacoding.sketchmemo.composables.Line
import kotlinx.coroutines.flow.MutableStateFlow
import java.io.File
import java.io.FileOutputStream

class MainViewModel : ViewModel() {

    private val state = MutableStateFlow(MainState())


    fun onEvent(event: MainEvent) {
        when (event) {
            is MainEvent.Save -> {
                state.value = state.value.copy(
                    lines = event.lines,
                    canvasSize = event.canvasSize
                )
                saveDrawingToFile(
                    lines = state.value.lines,
                    canvasSize = state.value.canvasSize
                )
            }
        }
    }



    private fun saveDrawingToFile(lines: List<Line>, canvasSize: Size) {
        val bitmap =
            Bitmap.createBitmap(canvasSize.width, canvasSize.height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)

        val paint = Paint()
        paint.isAntiAlias = true

        // Отрисовываем все линии на холсте
        for (line in lines) {
            canvas.drawLine(
                line.start.x,
                line.start.y,
                line.end.x,
                line.end.y,
                paint
            )
        }


        // Создаем файл для сохранения
        val fileName = "sketch.png"
        val file = File(Environment.getExternalStorageDirectory(), fileName)

        // Сохраняем изображение в файл
        try {
            val stream = FileOutputStream(file)
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, stream)
            stream.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}

