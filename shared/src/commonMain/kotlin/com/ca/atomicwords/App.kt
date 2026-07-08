package com.ca.atomicwords

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.ca.atomicwords.navigation.AppNavHost
import com.ca.atomicwords.navigation.bottombar.BottomBar
import com.ca.designsystem.theme.AtomicTheme

@Composable
@Preview
fun App() {
    AtomicTheme {
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