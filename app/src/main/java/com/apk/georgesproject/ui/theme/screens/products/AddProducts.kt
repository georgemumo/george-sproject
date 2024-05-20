package com.apk.georgesproject.ui.theme.screens.products


import android.content.Context
import android.net.Uri
import android.provider.MediaStore
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.apk.georgesproject.data.ProductViewModel
import com.apk.georgesproject.navigation.ROUTE_HOME
import com.apk.georgesproject.navigation.ROUTE_VIEW_UPLOAD

//import androidx.navigation.compose.rememberNavController
//import com.example.morningmvvm.data.ProductViewModel
//import com.example.morningmvvm.navigation.ROUTE_VIEW_PRODUCT
//import com.example.morningmvvm.navigation.ROUTE_VIEW_UPLOAD

//import com.example.firebaseauth.data.productviewmodel
//import com.example.firebaseauth.navigation.ROUTE_VIEW_PRODUCT

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddProductsScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var context = LocalContext.current
        Text(
            text = "TESTIMONIALS",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Blue,
            modifier = Modifier.padding(20.dp),
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline
        )

        var Name by remember { mutableStateOf(TextFieldValue("")) }
        var Occupation by remember { mutableStateOf(TextFieldValue("")) }
        var Date_of_buying by remember { mutableStateOf(TextFieldValue("")) }
        var Brand by remember { mutableStateOf(TextFieldValue("")) }
        OutlinedTextField(
            value = Name,
            onValueChange = { Name = it },
            label = { Text(text = "Name ") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = Occupation,
            onValueChange = { Occupation = it },
            label = { Text(text = "Occupation ") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = Date_of_buying,
            onValueChange = { Date_of_buying = it },
            label = { Text(text = "Date_of_buying ") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = Brand,
            onValueChange = { Brand = it },
            label = { Text(text = "Brand ") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {

            val productRepository = ProductViewModel.ProductViewModel(navController, context)
            productRepository.saveProduct(
                Name.text.trim(), Occupation.text.trim(),
                Date_of_buying.text.trim(), Brand.text.trim()
            )
            navController.navigate(ROUTE_HOME)


        }) {
            Text(text = "Save")
        }


    }

}
@Preview
@Composable
fun AddProductsScreenPreview() {
    AddProductsScreen(rememberNavController())

}

