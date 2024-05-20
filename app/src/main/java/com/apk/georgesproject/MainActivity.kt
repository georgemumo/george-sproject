package com.apk.georgesproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.Navigation
import androidx.navigation.compose.rememberNavController
import com.apk.georgesproject.navigation.AppNavHost
import com.apk.georgesproject.ui.theme.GeorgesprojectTheme
import com.apk.georgesproject.ui.theme.screens.BottomNavigationBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GeorgesprojectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavHost()
                    MainScreen()
                }
            }
        }
    }
}
@Composable
fun MainScreen(){
    val navController= rememberNavController()
    Scaffold (
        bottomBar = { BottomNavigationBar(navController)},
        content = {
            padding ->
            Box (modifier = Modifier.padding(padding)){
                AppNavHost(navController = navController)
            }
        },


    )
        

}
@Preview
@Composable
fun MainScreenPreview(){
    MainScreen()
}