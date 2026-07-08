package com.ca.atomicwords.navigation.bottombar

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.ca.designsystem.components.buttons.IconButton
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomBar(navController: NavHostController) {
    BottomAppBar(
        tonalElevation = BottomAppBarDefaults.ContainerElevation
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination

        val half = bottomNavigationItems.size / 2

        bottomNavigationItems.take(half).forEach { screen ->
            BottomNavItem(screen, currentDestination, navController)
        }

        IconButton(
            onClick = {}
        )

        bottomNavigationItems.drop(half).forEach { screen ->
            BottomNavItem(screen, currentDestination, navController)
        }
    }
}

@Composable
private fun RowScope.BottomNavItem(
    screen: BottonNavItems,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    NavigationBarItem(
        colors = NavigationBarItemDefaults.colors(
            selectedIconColor = Color(0xF6955DA8),
            unselectedIconColor = Color(0xFF828282),
        ),
        icon = { Icon(painter = painterResource(resource = screen.icon), contentDescription = null) },
        selected = currentDestination?.hierarchy?.any { destination ->
            destination.hasRoute(screen.route::class)
        } == true,
        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id) {
                    saveState = true
                }
                launchSingleTop = true
                restoreState = true
            }
        }
    )
}