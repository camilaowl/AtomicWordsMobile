package com.ca.designsystem.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun AtomicTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors

    CompositionLocalProvider(
        LocalAtomicColors provides colors,
        LocalAtomicShapes provides Shapes,
        LocalAtomicTypography provides Typography,
        LocalAtomicElevation provides Elevations,
        content = content
    )
}

object Theme {
    val colors: AtomicColors
        @Composable
        get() = LocalAtomicColors.current

    val shapes: AtomicShapes
        @Composable
        get() = LocalAtomicShapes.current

    val typography: AtomicTypography
        @Composable
        get() = LocalAtomicTypography.current

    val elevations: AtomicElevation
        @Composable
        get() = LocalAtomicElevation.current
}