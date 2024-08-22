package com.example.okfly.navigation



import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.okfly.ui.theme.screens.about.AboutScreen
import com.example.okfly.ui.theme.screens.home.HomeScreen
import com.example.okfly.ui.theme.screens.login.LoginScreen
import com.example.okfly.ui.theme.screens.signup.SignupScreen
import com.example.okfly.ui.theme.screens.splash.splashscreen
import com.example.realestate.ui.theme.screens.dashboard.DashboardScreen
import com.example.realestate.ui.theme.screens.products.AddProductsScreen
import com.example.realestate.ui.theme.screens.products.ViewProductsScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }

        composable(ROUT_ABOUT) {
            AboutScreen(navController = navController)
        }
        composable(ROUT_SPLASH) {
            splashscreen(navController = navController)
        }

        composable(ROUT_SIGNUP) {
            SignupScreen(navController = navController)
        }

        composable(ROUT_LOGIN) {
            LoginScreen(navController = navController)
        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController = navController)
        }
        composable(ADD_PRODUCTS_URL) {
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL) {
            ViewProductsScreen(navController = navController)
        }
        composable(ROUT_CAR) {
            ViewProductsScreen(navController = navController)
        }









    }
}
