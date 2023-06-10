package com.ibrahimdmr.shoppingcompose.feature.splash.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.ibrahimdmr.shoppingcompose.feature.splash.SplashScreenRoute

const val SplashNavigationRoute = "splash_route"

fun NavGraphBuilder.splashScreen(navigateToHome: () -> Unit, navigateToLogin: () -> Unit) {
    composable(SplashNavigationRoute) {
        SplashScreenRoute(navigateToHome = navigateToHome, navigateToLogin = navigateToLogin)
    }
}
