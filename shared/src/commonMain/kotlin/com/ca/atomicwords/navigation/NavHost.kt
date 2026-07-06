package com.ca.atomicwords.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.ca.auth.navigation.AuthGraph
import com.ca.auth.navigation.authNavGraph
import com.ca.navigation.TopLevelDestination

@Composable
fun AppNavHost(
    navController: NavHostController,
    startDestination: TopLevelDestination = AuthGraph
) {
    NavHost(navController = navController, startDestination = startDestination) {
        authNavGraph()
    }
}
