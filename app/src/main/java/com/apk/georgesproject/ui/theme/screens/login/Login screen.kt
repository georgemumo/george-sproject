package com.apk.georgesproject.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.input.ImeAction
//import androidx.compose.ui.text.input.TextFieldValue
//import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
//import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.apk.georgesproject.navigation.ROUTE_REGISTER
//
//@Composable
//fun LoginScreen(navController: NavController){
//
//   var email by remember { mutableStateOf(TextFieldValue(""))}
//    var pass by remember {mutableStateOf(TextFieldValue("")) }
//    var confirmpass by remember {mutableStateOf(TextFieldValue("")) }
//  var context= LocalContext.current
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.Gray),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center,
//
//    ) {
//        Text(text = "Please login here",
//            color = Color.Red,
//            fontSize = 30.sp,
//            fontFamily = FontFamily.Serif,
//            fontWeight = FontWeight.Bold)
//        Spacer(modifier = Modifier.height(20.dp))
//        OutlinedTextField(value = email,
//            onValueChange = {newText->email=newText},
//            label = { Text(text = "Enter your Email",
//
//                )},
//            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(10.dp)
//        )
//        Spacer(modifier = Modifier.height(20.dp))
//        OutlinedTextField(value = pass,
//            onValueChange = {newText->pass=newText},
//            label = { Text(text = "Enter your Password",
//
//                )},
//            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(10.dp)
//        )
//        OutlinedTextField(value = confirmpass,
//            onValueChange = {newText->confirmpass=newText},
//            label = { Text(text = "Confirm your Password",
//
//                )},
//            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(10.dp)
//        )
//        Button(onClick = {
//
//        },
//        modifier = Modifier.fillMaxWidth()
//        ) {
//            Text(text = "Log in")
//
//        }
//        Spacer(modifier = Modifier.height(20.dp))
//        OutlinedTextField(value = "",
//            onValueChange = {},
//            label = { Text(text = "Enter your Email")},
//            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(10.dp)
//        )
//        Spacer(modifier = Modifier.height(20.dp))
//        Button(onClick = { /*TODO*/ },
//            modifier = Modifier.fillMaxWidth()
//            ) {
//            Text(text = "Don't have an account? Click to create one")
//        }
//
//
//    }
//}
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun LoginScreenPreview(){
//    LoginScreen(rememberNavController())
//}

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.apk.georgesproject.R
import com.apk.georgesproject.data.AuthViewModel
import com.apk.georgesproject.navigation.ROUTE_HOME

@Composable
fun LoginScreen(navController: NavController){
Column ( modifier = Modifier
    .fillMaxSize()
    .background(color = Color.White),
    verticalArrangement = Arrangement.Top,
    horizontalAlignment = Alignment.CenterHorizontally
){
    Box {
        Image(painter = painterResource(id = R.drawable.logo), contentDescription ="" )
    }
    var password by remember {
        mutableStateOf(TextFieldValue(""))
    }
    var context= LocalContext.current
    var isChecked by remember { mutableStateOf(false) }
    var email by remember { mutableStateOf(TextFieldValue("")) }
    Text(text = "Log in",
        fontSize = 33.sp,
        color = Color.Blue,
        fontWeight = FontWeight.Bold
    )
    Spacer(modifier = Modifier.height(20.dp))
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = email, onValueChange = {email=it},
        placeholder = { Text(text = "Enter your email") },
        leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") }

    )
    Spacer(modifier = Modifier.height(20.dp))
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = password, onValueChange = {password=it},
        placeholder = { Text(text = "Enter your password") },
        leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") }

    )
    Spacer(modifier = Modifier.height(20.dp))
    Row {
        Checkbox(checked = isChecked, onCheckedChange = {isChecked=it},
            enabled = true,
            modifier = Modifier
                .padding(5.dp)
                .size(3.dp)
            , colors = CheckboxDefaults.colors()
        )
        Spacer(modifier = Modifier.padding(6.dp))
        Text(text = "I agree to the terms & conditions")
    }
    Spacer(modifier = Modifier.height(20.dp))
    Button(onClick = {
        val mylogin= AuthViewModel(navController, context )
        mylogin.logIn(email.text.trim(),password.text.trim())
        navController.navigate(ROUTE_HOME)
    }, modifier = Modifier.fillMaxWidth()) {
        Text(text = "Log In")
    }

    Spacer(modifier = Modifier.height(20.dp))
    Button(onClick = { navController.navigate(ROUTE_REGISTER)}) {
        Text(text = "Don't have an account?Click to create one")
    }



}

}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}