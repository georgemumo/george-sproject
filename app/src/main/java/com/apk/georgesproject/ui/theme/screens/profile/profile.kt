package com.apk.georgesproject.ui.theme.screens.profile

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.apk.georgesproject.R



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileCard(){
    Card (modifier = Modifier.wrapContentHeight(),
                    shape = RoundedCornerShape(15.dp),
        elevation= CardDefaults.cardElevation(25.dp)
    ){
        Box {
            Image(painter = painterResource(id = R.drawable.background), contentDescription = "card")
            Box (modifier = Modifier.matchParentSize(),
                contentAlignment = Alignment.BottomEnd

            ){
                TopAppBar(title = { Text(text = "Houses")  },
                    navigationIcon = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(imageVector = Icons.Filled.Home, contentDescription = "")
                        }
                    },

                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color.Red,
                        titleContentColor = Color.White,
                        navigationIconContentColor = Color.Black
                    ),
                    actions = {
                        IconButton(onClick = {
                        }) {
                            Icon(imageVector = Icons.Filled.Call, contentDescription ="" )
                        }
                    }

                )

            }
        }
    }
}
@Preview
@Composable
fun ProfileCardPreview(){
    ProfileCard()
}