package com.apk.georgesproject.ui.theme.screens.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.apk.georgesproject.R
import com.apk.georgesproject.navigation.ROUTE_ABOUT
import com.apk.georgesproject.navigation.ROUTE_ADD_PRODUCT
import com.apk.georgesproject.navigation.ROUTE_HOME


@Composable
fun AboutScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .verticalScroll((rememberScrollState()))

    ) {
        Box (contentAlignment = Alignment.Center){

            Text(
                text = "About us",
                color = Color.Red, fontSize = 34.sp,
                textDecoration = TextDecoration.Underline,
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Tata Motors has emerged as a global leader in automobile manufacturing with millions of vehicles serving customers across the globe. Operating in over a hundred countries with thousands of touch points, the company guarantees quality service and support fuelled by values of care and commitment.",
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Values that drive us are as follows", color = Color.Black)
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            verticalAlignment = Alignment.Bottom,
            modifier = Modifier.fillMaxWidth()

        ) {
            Box(modifier = Modifier.fillMaxWidth()) {

                Row {

                    Card {
                        Image(
                            painter = painterResource(id = R.drawable.img),
                            contentDescription = "quality",

                            )
                        Text(text = "Quality")
                    }
                    Spacer(modifier = Modifier.padding(10.dp))


                    Card {
                        Image(
                            painter = painterResource(id = R.drawable.img_1),
                            contentDescription = ""
                        )
                        Text(text = "Support")

                    }

                    Spacer(modifier = Modifier.padding(10.dp))

                    Card {
                        Image(
                            painter = painterResource(id = R.drawable.img_2),
                            contentDescription = ""
                        )
                        Text(text = "Available")
                    }
                    Spacer(modifier = Modifier.padding(10.dp))

                    Card {
                        Image(
                            painter = painterResource(id = R.drawable.img_3),
                            contentDescription = ""
                        )
                        Text(text = "Honesty")

                    }

                }

            }
            Spacer(modifier = Modifier.padding(10.dp))
            Card {
                Image(painter = painterResource(id = R.drawable.img_2), contentDescription = "")
            }
            Spacer(modifier = Modifier.padding(10.dp))


        }
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Tata Motors has been at the forefront of technology and product innovations that have contributed significantly in facilitating the nation's growth. Today, it has emerged as the leader in Medium & Heavy Commercial Vehicles Truck category with 25 lakh trucks rolled out so far. ")
        Text(text = "Our share holders", color = Color.Black, fontSize = 23.sp,)


        Row(
            modifier = Modifier.horizontalScroll(rememberScrollState())
        ) {

            Card(
                modifier = Modifier
                    .height(250.dp)
                    .width(200.dp)
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_5),
                            contentDescription = "newyork",
                            contentScale = ContentScale.Crop
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Manager",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )

                }
            }
            Spacer(modifier = Modifier.width(5.dp))

            Card(
                modifier = Modifier
                    .height(250.dp)
                    .width(200.dp)
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.person2),
                            contentDescription = "newyork",
                            contentScale = ContentScale.Crop
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Assistant manager",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )

                }
            }
            Spacer(modifier = Modifier.width(5.dp))

            Card(
                modifier = Modifier
                    .height(250.dp)
                    .width(200.dp)
            ) {
                Column {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_4),
                            contentDescription = "newyork",
                            contentScale = ContentScale.Crop
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Secretary",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )

                }
            }
        }


        Spacer(modifier = Modifier.height(10.dp))

        val context = LocalContext.current.applicationContext


        BottomAppBar(
            modifier = Modifier.fillMaxWidth(),



            actions = {
                Box {
                    IconButton(onClick = {
                        navController.navigate(ROUTE_HOME)

                    }) {
                        Icon(
                            imageVector = Icons.Filled.Home,
                            contentDescription = "Search",
                            tint = Color.Black ,
                            modifier = Modifier.size(129.dp)
                        )

                    }
                }

                Spacer(modifier = Modifier.padding(39.dp))
                IconButton(onClick = { navController.navigate(ROUTE_ADD_PRODUCT) }) {
                    Icon(
                        imageVector = Icons.Filled.AddCircle,
                        contentDescription = "share",
                        tint = Color.Black,
                        modifier = Modifier.size(129.dp)
                    )
                }
                Spacer(modifier = Modifier.padding(39.dp))
                IconButton(onClick = { navController.navigate(ROUTE_ABOUT)}) {
                    Icon(
                        imageVector = Icons.Filled. Info,
                        contentDescription = "menu",
                        tint = Color.Black
                        ,modifier = Modifier.size(129.dp)
                    )
                }




            }
        )


    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AboutScreenPreview(){
    AboutScreen(rememberNavController() )
}