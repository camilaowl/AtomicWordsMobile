package com.ca.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val Elevations = AtomicElevation(
    default = 2.dp,
    pressed = 4.dp
)

@Immutable
data class AtomicElevation(
    val default: Dp,
    val pressed: Dp
)

val LocalAtomicElevation = staticCompositionLocalOf<AtomicElevation> {
    error("No AtomicElevation Provided")
}