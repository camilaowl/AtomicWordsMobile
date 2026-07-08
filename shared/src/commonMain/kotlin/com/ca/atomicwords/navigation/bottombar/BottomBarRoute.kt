package com.ca.atomicwords.navigation.bottombar

import kotlinx.serialization.Serializable


@Serializable
sealed interface BottomBarRoute {
    @Serializable data object Home : BottomBarRoute
    @Serializable data object Dictionary : BottomBarRoute
    @Serializable data object Training : BottomBarRoute
    @Serializable data object Profile : BottomBarRoute
}

