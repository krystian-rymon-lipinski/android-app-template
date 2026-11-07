package com.krystianrymonlipinski.androidapptemplate.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle

@Immutable
data class CustomTypography(val customTypographyExample: TextStyle) {
    companion object {
        val DEFAULT = CustomTypography(TextStyle.Default)
    }
}

val CustomTypographyInstance = CustomTypography(TextStyle.Default)
