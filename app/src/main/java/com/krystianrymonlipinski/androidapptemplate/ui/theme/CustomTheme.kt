package com.krystianrymonlipinski.androidapptemplate.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalContext

val LocalCustomTypography = staticCompositionLocalOf {
    CustomTypography.DEFAULT
}

val LocalCustomShapes = staticCompositionLocalOf {
    CustomShapes.DEFAULT
}

val LocalCustomColorScheme = staticCompositionLocalOf {
    CustomColorScheme.DEFAULT
}

@Composable
fun MyTheme(isSystemInDarkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val context = LocalContext.current
    val colors = when {
        (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) -> {
            if (isSystemInDarkTheme) {
                dynamicDarkColorScheme(context)
            } else {
                dynamicLightColorScheme(context)
            }
        }
        isSystemInDarkTheme -> BaseColorSchemeDark
        else -> BaseColorSchemeLight
    }

    MaterialTheme(
        colorScheme = colors,
        content = content
    )

    CompositionLocalProvider(
        LocalCustomTypography provides CustomTypographyInstance,
        LocalCustomShapes provides CustomShapesInstance,
        LocalCustomColorScheme provides provideCustomColorScheme(isSystemInDarkTheme)
    ) {
        MaterialTheme {
            content()
        }
    }
}

@Composable
fun provideCustomColorScheme(isSystemInDarkTheme: Boolean) = if (isSystemInDarkTheme) {
    CustomColorSchemeDarkInstance
} else {
    CustomColorSchemeLightInstance
}

object MyTheme {
    val base: MaterialTheme
        @Composable get() = MaterialTheme
    val custom: CustomTheme
        @Composable get() = CustomTheme
}

object CustomTheme {
    val typography: CustomTypography
        @Composable get() = LocalCustomTypography.current
    val shapes: CustomShapes
        @Composable get() = LocalCustomShapes.current
    val colorScheme: CustomColorScheme
        @Composable get() = LocalCustomColorScheme.current
}
