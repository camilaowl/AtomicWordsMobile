package com.ca.auth.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.ca.auth.signin.SignInScreen
import com.ca.navigation.TopLevelDestination
import kotlinx.serialization.Serializable

@Serializable
data object AuthGraph : TopLevelDestination {
    @Serializable
    data object Login
    @Serializable
    data object SignUp
    @Serializable
    data object ForgotPassword
}

fun NavGraphBuilder.authNavGraph() {
    navigation<AuthGraph>(
        startDestination = AuthGraph.Login,
    ) {
        composable<AuthGraph.Login> {
            SignInScreen()
        }
    }

}