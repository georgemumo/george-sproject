package com.apk.georgesproject.ui.theme.screens.gallery

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.apk.georgesproject.R

@Composable
fun ImageComponent(navController: NavController){

        Box (
            modifier = Modifier.fillMaxSize()
        ){
            Image(painter = painterResource(id = R.drawable.light) , contentDescription = "image")
            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "lighting")
                }
            }
        }
    }
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ImageComponentPreview(){
    ImageComponent(rememberNavController())
}