package com.apk.georgesproject.ui.theme.screens.products

import android.content.res.Configuration
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import com.apk.georgesproject.models.Product
import com.apk.georgesproject.navigation.ROUTE_VIEW_PRODUCT
//import com.example.morningmvvm.data.ProductViewModel
//import com.example.morningmvvm.models.Product
//import com.example.morningmvvm.navigation.ROUTE_VIEW_PRODUCT
////import com.example.firebaseauth.data.productviewmodel
//import com.example.firebaseauth.models.Product
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UpdateProductsScreen(navController: NavHostController,id:String) {
   Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        var context = LocalContext.current
        var name by remember { mutableStateOf("") }
        var brand by remember { mutableStateOf("") }
        var occupation by remember { mutableStateOf("") }
       var date by remember { mutableStateOf("")   }

        var currentDataRef = FirebaseDatabase.getInstance().getReference()
            .child("Products/$id")
        currentDataRef.addValueEventListener(object: ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                var product = snapshot.getValue(Product::class.java)
                name = product!!.Name
                brand = product!!.Brand
                occupation = product!!.Occupation
                date=product!! .Date

            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(context, error.message, Toast.LENGTH_SHORT).show()
            }
        })

        Text(
            text = "Add product",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Red,
            modifier = Modifier.padding(20.dp),
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline
        )

       var Name by remember { mutableStateOf(TextFieldValue(name)) }
        var Brand by remember { mutableStateOf(TextFieldValue(brand)) }
        var Occupation by remember { mutableStateOf(TextFieldValue(occupation)) }
       var Date by remember { mutableStateOf(TextFieldValue(date))  }

        OutlinedTextField(
            value = Name,
            onValueChange = { Name = it },
            label = { Text(text = "Full name ") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = Brand,
            onValueChange = {Brand = it },
            label = { Text(text = "Brand Bought") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = Occupation,
            onValueChange = { Occupation = it },
            label = { Text(text = "Occupation") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {

            var productRepository = ProductViewModel.ProductViewModel(navController, context)
            productRepository.updateProduct(Name.text.trim(),Occupation.text.trim(), Brand.text.trim(),Date.text.trim(),id)
            navController.navigate(ROUTE_VIEW_PRODUCT)

        }) {
            Text(text = "Update")
        }

    }



}

@Preview
@Composable
fun UpdateProductScreenPreview() {
    UpdateProductsScreen(rememberNavController(), id = "")
}