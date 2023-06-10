package com.ibrahimdmr.shoppingcompose.feature.login.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.ibrahimdmr.shoppingcompose.feature.login.LoginScreenRoute

const val LoginNavigationRoute = "login_route"

fun NavGraphBuilder.loginScreen() {
    composable(LoginNavigationRoute) {
        LoginScreenRoute()
    }
}
