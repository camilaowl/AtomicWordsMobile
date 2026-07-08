package com.ca.atomicwords

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.ca.atomicwords.navigation.AppNavHost
import com.ca.atomicwords.navigation.bottombar.BottomBar

@Composable
@Preview
fun App() {
    MaterialTheme {
        val navController = rememberNavController()

        Scaffold(
            bottomBar = { BottomBar(navController) }
        ) { innerPadding ->
            AppNavHost(
                navController = navController,
                innerPadding = innerPadding
            )
        }
    }
}