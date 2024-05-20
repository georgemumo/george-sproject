package com.apk.georgesproject.ui.theme.screens

import androidx.compose.material3.Icon

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.apk.georgesproject.R
import com.apk.georgesproject.ui.theme.screens.NavigationItem.AddCircle.route
import com.apk.georgesproject.ui.theme.screens.about.AboutScreen
import com.apk.georgesproject.ui.theme.screens.home.HomeScreen

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

//@Composable
//fun BottomNavigationBar(navController: NavController) {
//    val items = listOf(
//        NavigationItem.Home,
//        NavigationItem.AddCircle,
//        NavigationItem.Info,
//
//
//    )
//
//        val navBackStackEntry by navController.currentBackStackEntryAsState()
//        val currentRoute = navBackStackEntry?.destination?.route
//        items.forEach { item ->
//            BottomNavigationItem(
//                icon = { Icon(painterResource(id = item.icon), contentDescription = item.tittle) },
//                label = { Text(text = item.tittle) },
//                selectedContentColor = Color.White,
//                unselectedContentColor = Color.White.copy(0.4f),
//                alwaysShowLabel = true,
//                selected = currentRoute == item.route,
//                onClick = {
//                    navController.navigate(item.route){
//                        navController.graph.startDestinationRoute?.let {
//                            popUpTo(route){
//                                saveState=true
//                            }
//                        }
//                        launchSingleTop=true
//                        restoreState=true
//                    }
//
//                }
//            )
//        }
//    }
//}

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val screens = listOf(
        NavigationItem.Home,
        NavigationItem.AddCircle,
        NavigationItem.Info
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    NavigationBar {
        screens.forEach { screen ->
            NavigationBarItem(
                icon = { Icon(screen.icon, contentDescription = screen.tittle) },
                label = { Text(screen.tittle) },
                selected = currentRoute == screen.route,
                onClick = {
                    navController.navigate(screen.route) {
                        // Avoid multiple copies of the same destination
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        // Restore state when reselecting a previously selected item
                        restoreState = true
                        // Avoid multiple copies of the same destination when reselecting the same item
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomNavigationBarPreview() {
    BottomNavigationBar(rememberNavController())
}
