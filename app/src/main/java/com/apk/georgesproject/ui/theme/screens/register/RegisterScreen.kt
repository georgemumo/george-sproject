package com.apk.georgesproject.ui.theme.screens.register

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
//import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.apk.georgesproject.R
import com.apk.georgesproject.navigation.ROUTE_LOGIN
//
//@Composable
//fun RegisterScreen(navController: NavController){
//    Column (
//        modifier = Modifier.padding(20.dp),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ){
//        Box (modifier = Modifier.fillMaxSize())
//
//        {
//
//            Image(painter = painterResource(id = R.drawable.background), contentDescription ="back" )
//
//
//                Box (
//                    modifier = Modifier.wrapContentHeight(),
//
//
//                ){
//                    Button(onClick = {
//                        navController.navigate(ROUTE_LOGIN)
//                    }) {
//                        Text(text = "Go to log in screen")
//                    }
//
//                }
//            }
//        }
//        Spacer(modifier = Modifier.height(10.dp))
//        }
//
//
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun RegisterScreenPreview(){
//    RegisterScreen(rememberNavController())
//}

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.apk.georgesproject.data.AuthViewModel
import com.apk.georgesproject.navigation.ROUTE_HOME


@Composable
fun RegisterScreen(navController: NavController){
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    var confirmpassword by remember { mutableStateOf(TextFieldValue("")) }
    var context= LocalContext.current
    var age by remember { mutableStateOf(TextFieldValue("")) }
    var fullName by remember { mutableStateOf(TextFieldValue(""))  }
    var phoneNumber by remember { mutableStateOf(TextFieldValue(""))  }
    Column(modifier= Modifier
        .fillMaxSize()
        .background(color = Color.White), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

        Text(text = "Register here",
            color = Color.Red,
            fontFamily = FontFamily.SansSerif,
            fontSize = 30.sp)
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = email, onValueChange = { email = it },
            label = { Text(text = "Enter Email") },

            keyboardOptions = KeyboardOptions . Default . copy (imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),

            )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value =password , onValueChange = {password=it},
            label = { Text(text = "Enter password") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value =confirmpassword , onValueChange = {
            confirmpassword=it},
            label = { Text(text = "Enter Confirm Password") },

            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))

        Spacer(modifier = Modifier.height(20.dp))
//        OutlinedTextField(
//            modifier = Modifier.fillMaxWidth(),
//            value = phoneNumber, onValueChange ={phoneNumber=it},
//            placeholder = { Text(text = "0776****90")},
//            leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription ="" ) }
//        )
//        Spacer(modifier = Modifier.height(20.dp))
//        OutlinedTextField(
//            modifier = Modifier.fillMaxWidth(),
//            value = age, onValueChange = {age=it},
//            placeholder = { Text(text = "Enter your age")}
//        )


        Button(onClick = {
           val myregister= AuthViewModel(navController,context)
            myregister.signUp(email.text.trim(),password.text.trim(),confirmpassword.text.trim(),)
            navController.navigate(ROUTE_HOME)




        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Register ")
        }
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate(ROUTE_LOGIN)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Have an Account? Click to Login")
        }

    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegisterScreenPreview() {
    RegisterScreen(rememberNavController())

}