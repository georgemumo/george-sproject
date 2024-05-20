package com.apk.georgesproject.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.apk.georgesproject.models.ViewUploadsScreen
import com.apk.georgesproject.ui.theme.screens.NavigationItem
import com.apk.georgesproject.ui.theme.screens.about.AboutScreen
import com.apk.georgesproject.ui.theme.screens.gallery.ImageComponent
import com.apk.georgesproject.ui.theme.screens.home.HomeScreen
import com.apk.georgesproject.ui.theme.screens.login.LoginScreen
import com.apk.georgesproject.ui.theme.screens.register.RegisterScreen
import com.apk.georgesproject.ui.theme.screens.products.AddProductsScreen
import com.apk.georgesproject.ui.theme.screens.products.UpdateProductsScreen
import com.apk.georgesproject.ui.theme.screens.products.ViewProductsScreen
import com.apk.georgesproject.ui.theme.screens.reasons.ReasonsScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_REGISTER){
    NavHost(navController = navController,
        modifier = modifier,
        startDestination = startDestination ){
        composable(ROUTE_HOME){ HomeScreen(navController)}
        composable(ROUTE_ABOUT){ AboutScreen(navController)}
        composable(ROUTE_REGISTER){ RegisterScreen(navController)}
        composable(ROUTE_LOGIN){ LoginScreen(navController)}
        composable(ROUTE_ADD_PRODUCT){ AddProductsScreen(navController)}
        composable(ROUTE_GALLERY){ ImageComponent(navController )}
        composable(ROUTE_REASONS){ ReasonsScreen(navController)}
        composable(ROUTE_VIEW_PRODUCT){ ViewProductsScreen(navController )}
        composable(NavigationItem.Home.route) {
            HomeScreen(rememberNavController())
        }
        composable(NavigationItem.AddCircle.route) {
            AddProductsScreen(rememberNavController())
        }
        composable(NavigationItem.Info.route) {
           AboutScreen(rememberNavController())
        }
        composable(ROUTE_UPDATE_PRODUCT+"/{id}"){
            passedData-> UpdateProductsScreen(
                navController,passedData.arguments?.getString("id")!!
            )}
        composable(ROUTE_VIEW_UPLOAD){
            ViewUploadsScreen(navController)
        }
    }

}