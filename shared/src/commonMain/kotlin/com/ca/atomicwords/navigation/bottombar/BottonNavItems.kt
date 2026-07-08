package com.ca.atomicwords.navigation.bottombar

import com.ca.atomicwords.navigation.MainGraph
import com.ca.designsystem.Resources
import org.jetbrains.compose.resources.DrawableResource

sealed class BottonNavItems(val route: MainGraph, val icon: DrawableResource) {
    data object Home : BottonNavItems(MainGraph.Home, Resources.Icon.Home)
    data object Dictionary : BottonNavItems(MainGraph.Dictionary, Resources.Icon.Dictionary)
    data object Training : BottonNavItems(MainGraph.Training, Resources.Icon.Training)
    data object Profile : BottonNavItems(MainGraph.Profile, Resources.Icon.Profile)
}

internal val bottomNavigationItems = listOf(
    BottonNavItems.Home,
    BottonNavItems.Dictionary,
    BottonNavItems.Training,
    BottonNavItems.Profile,
)