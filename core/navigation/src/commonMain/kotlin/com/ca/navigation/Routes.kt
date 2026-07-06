package com.ca.navigation

import kotlinx.serialization.Serializable

interface TopLevelDestination

@Serializable
sealed class AppRoute : TopLevelDestination {
    @Serializable
    data object Home : AppRoute()
    @Serializable
    data object Auth : AppRoute()
    @Serializable
    data object Onboarding : AppRoute()
}