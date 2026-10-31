package com.krystianrymonlipinski.androidapptemplate.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape

@Immutable
data class CustomShapes(val customShapeExample: Shape) {
    companion object {
        val DEFAULT = CustomShapes(RectangleShape)
    }
}

val CustomShapesInstance = CustomShapes(RectangleShape)
