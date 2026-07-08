package com.ca.atomicwords.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ca.atomicwords.navigation.bottombar.BottomBar
import com.ca.auth.navigation.AuthGraph
import com.ca.auth.navigation.authNavGraph
import com.ca.dictionary.presentation.DictionaryScreen
import com.ca.home.presentation.HomeScreen
import com.ca.navigation.TopLevelDestination
import com.ca.profile.presentation.ProfileScreen
import com.ca.training.presentation.TrainingScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    startDestination: TopLevelDestination = AuthGraph,
    innerPadding: PaddingValues
) {
    NavHost(
        navController = navController,
        startDestination = MainGraph.Dictionary,
        modifier = Modifier.padding(innerPadding)
    ) {
        authNavGraph()

        composable<MainGraph.Home> {
            HomeScreen()
        }

        composable<MainGraph.Dictionary> {
            DictionaryScreen()
        }

        composable<MainGraph.Training> {
            TrainingScreen()
        }

        composable<MainGraph.Profile> {
            ProfileScreen()
        }
    }
}
