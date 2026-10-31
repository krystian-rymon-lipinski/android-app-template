package com.krystianrymonlipinski.androidapptemplate.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class CustomColorScheme(val customColorExample: Color) {
    companion object {
        val DEFAULT = CustomColorScheme(Color.Unspecified)
    }
}
val CustomColorSchemeLightInstance = CustomColorScheme(Color.Unspecified)

val CustomColorSchemeDarkInstance = CustomColorScheme(Color.Unspecified)
