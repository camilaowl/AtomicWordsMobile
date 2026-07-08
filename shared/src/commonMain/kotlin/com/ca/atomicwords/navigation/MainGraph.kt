package com.ca.atomicwords.navigation

import com.ca.navigation.TopLevelDestination
import kotlinx.serialization.Serializable

@Serializable
sealed class MainGraph : TopLevelDestination {

    @Serializable
    data object Home : MainGraph()

    @Serializable
    data object Dictionary : MainGraph()

    @Serializable
    data object Training : MainGraph()

    @Serializable
    data object Profile : MainGraph()
}