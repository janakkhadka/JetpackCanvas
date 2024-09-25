package com.example.jetpackcanvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FlagScreen(modifier: Modifier = Modifier) {

    Canvas(modifier = Modifier
        .fillMaxSize()
        .background(color=Color.White)
    ) {
        val canvasWidth = size.width
        val canvasHeight = size.height
        drawLine(
            start = Offset(x = 200f, y = 200f),
            end = Offset(x = 200f, y = 1200f),
            color = Color.Blue,
            strokeWidth = 30f
        )
        drawLine(
            start = Offset(x = 200f, y = 200f),
            end = Offset(x = 650f, y = 600f),
            color = Color.Blue,
            strokeWidth = 30f
        )
        drawLine(
            start = Offset(x = 200f, y = 600f),
            end = Offset(x = 650f, y = 600f),
            color = Color.Blue,
            strokeWidth = 30f
        )
        drawLine(
            start = Offset(x = 200f, y = 600f),
            end = Offset(x = 850f, y = 1200f),
            color = Color.Blue,
            strokeWidth = 30f
        )
        drawLine(
            start = Offset(x = 200f, y = 1200f),
            end = Offset(x = 850f, y = 1200f),
            color = Color.Blue,
            strokeWidth = 30f
        )
        drawLine(
            start = Offset(x = 200f, y = 1200f),
            end = Offset(x = 200f, y = 1600f),
            color = Color.Black,
            strokeWidth = 30f
        )



    }

}