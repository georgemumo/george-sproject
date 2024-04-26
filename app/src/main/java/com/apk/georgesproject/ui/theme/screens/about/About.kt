package com.apk.georgesproject.ui.theme.screens.about

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
//import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

//
//@Composable
//fun AboutScreen(navController: NavController){
//    Column (
//        modifier = Modifier.padding(20.dp),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ){
//        Text(text = "This is About us screen")
//        Spacer(modifier = Modifier.height(10.dp))
//        Button(onClick = { /*TODO*/ }) {
//            Text(text = "Go to home screen")
//        }
//    }
//}
//
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun RegisterScreenPreview(){
//    AboutScreen(rememberNavController())
//}

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.apk.georgesproject.navigation.ROUTE_HOME
//import com.example.morningmvvm.navigation.ROUTE_HOME

@Composable
fun AboutScreen(navController: NavController){
    Column (horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "ABOUT SCREEN")
        }
        Button(onClick = {navController.navigate(ROUTE_HOME)},
            colors = ButtonDefaults.buttonColors(Color.Red)) {
            Text(text = "To HOME Screen")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AboutScreenPreview(){
//    LoginScreen()
}