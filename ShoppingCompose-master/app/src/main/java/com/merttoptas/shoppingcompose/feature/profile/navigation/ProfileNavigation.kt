package com.ibrahimdmr.shoppingcompose.feature.profile.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.ibrahimdmr.shoppingcompose.feature.profile.ProfileScreenRoute

const val ProfileNavigationRoute = "profile_route"

fun NavController.navigateToProfile(
    navOptions: NavOptions? = null,
) {
    this.navigate(ProfileNavigationRoute, navOptions)
}

fun NavGraphBuilder.profileScreen() {
    composable(ProfileNavigationRoute) {
        ProfileScreenRoute()
    }
}
