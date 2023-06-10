package com.ibrahimdmr.shoppingcompose.feature.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.ibrahimdmr.shoppingcompose.feature.category.navigation.categoryScreen
import com.ibrahimdmr.shoppingcompose.feature.home.navigation.HomeNavigationRoute
import com.ibrahimdmr.shoppingcompose.feature.home.navigation.homeScreen
import com.ibrahimdmr.shoppingcompose.feature.login.navigation.LoginNavigationRoute
import com.ibrahimdmr.shoppingcompose.feature.login.navigation.loginScreen
import com.ibrahimdmr.shoppingcompose.feature.productdetail.navigation.navigateToProductDetail
import com.ibrahimdmr.shoppingcompose.feature.productdetail.navigation.productDetailScreen
import com.ibrahimdmr.shoppingcompose.feature.profile.navigation.profileScreen
import com.ibrahimdmr.shoppingcompose.feature.splash.navigation.SplashNavigationRoute
import com.ibrahimdmr.shoppingcompose.feature.splash.navigation.splashScreen

@Composable
fun MainNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: String = SplashNavigationRoute
) {
    NavHost(
        modifier = modifier,
        navController = navController, startDestination = startDestination
    ) {
        loginScreen()
        homeScreen(navigateToDetail = { id ->
            navController.navigateToProductDetail(id)
        })
        splashScreen(navigateToLogin = {
            navController.navigate(LoginNavigationRoute) {
                popUpTo(LoginNavigationRoute) {
                    inclusive = true
                }
            }
        }, navigateToHome = {
            navController.navigate(HomeNavigationRoute) {
                popUpTo(LoginNavigationRoute) {
                    inclusive = true
                }
            }
        })
        profileScreen()
        categoryScreen()
        productDetailScreen()
    }
}
