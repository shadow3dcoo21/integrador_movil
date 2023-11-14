package com.example.laboratorio8

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@RequiresApi(Build.VERSION_CODES.O)
@SuppressLint("")
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun Vida_Util(navController: NavHostController) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState())
    val color_fondo_top = Color(0xFFF74357B)
    val color_fondo_footer = Color.White
    val color_mass = Color.Black


    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        bottomBar = {
            BottomAppBar(
                containerColor = color_fondo_footer,

                actions = {
                    Row ( modifier = Modifier
                        .background(Color.White)
                    ){
                        IconButton(modifier = Modifier
                            .padding(horizontal = 12.dp)
                            .scale(1.5f),onClick = { navController.navigate("pantalla1") }) {
                            Icon(

                                painterResource(R.drawable.home )
                                ,
                                contentDescription = " ",
                                tint = Color.Black,

                                )

                        }
                        IconButton(modifier = Modifier
                            .padding(horizontal = 12.dp)
                            .scale(1.5f),onClick = { /* do something */ }) {
                            Icon(

                                painterResource(R.drawable.search )
                                ,
                                contentDescription = " ",
                                tint = Color.Black,

                                )
                        }
                        IconButton(modifier = Modifier
                            .padding(horizontal = 12.dp)
                            .scale(2f),onClick = { /* do something */ }) {
                            Image(
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)

                                    .size(60.dp)

                                    .clip(
                                        RoundedCornerShape(
                                            topEnd = 100.dp,
                                            topStart = 100.dp,
                                            bottomEnd = 100.dp,
                                            bottomStart = 100.dp
                                        )
                                    )
                                ,
                                painter = painterResource(R.drawable.medio),
                                contentDescription ="ss"
                            )
                        }
                        IconButton(modifier = Modifier
                            .padding(horizontal = 12.dp)
                            .scale(1.5f),onClick = { /* do something */ }) {
                            Image(
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)

                                    .size(60.dp)

                                    .clip(
                                        RoundedCornerShape(
                                            topEnd = 100.dp,
                                            topStart = 100.dp,
                                            bottomEnd = 100.dp,
                                            bottomStart = 100.dp
                                        )
                                    )
                                ,
                                painter = painterResource(R.drawable.comment),
                                contentDescription ="ss"
                            )
                        }
                        IconButton(modifier = Modifier
                            .padding(horizontal = 12.dp)
                            .scale(1.5f),onClick = { /* do something */ }) {
                            Image(
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)


                                    .clip(
                                        RoundedCornerShape(
                                            topEnd = 100.dp,
                                            topStart = 100.dp,
                                            bottomEnd = 100.dp,
                                            bottomStart = 100.dp
                                        )
                                    )
                                ,
                                painter = painterResource(R.drawable.bell),
                                contentDescription ="ss"
                            )
                        }
                    }





                },

                )
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier

                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Row(
                modifier = Modifier.height(10.dp),
                horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
            ){
                Text(

                    modifier = Modifier
                        .fillMaxWidth()
                    ,

                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight(400),
                    fontFamily = FontFamily.Default,
                    fontSize = 21.sp,
                    color = Color(0xFF000000),
                    text = " ".trimIndent()



                )
            }
            Text(
                modifier = Modifier
                    .width(335.dp)
                    .background(Color.Transparent)
                    .align(Alignment.CenterHorizontally)
                ,

                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.Black,
                text = "VIDA UTIL".trimIndent()
            )
            Spacer(modifier = Modifier.height(40.dp))
            Row (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)

                ,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
            ){


                Column (modifier = Modifier.background(Color.Transparent)){
                    Image(
                        modifier = Modifier

                            .background(Color.Transparent)
                            .size(60.dp)
                            .align(Alignment.CenterHorizontally)
                            .clip(
                                RoundedCornerShape(
                                    topEnd = 100.dp,
                                    topStart = 100.dp,
                                    bottomEnd = 100.dp,
                                    bottomStart = 100.dp
                                )
                            )
                        ,
                        painter = painterResource(R.drawable.imagen_2),
                        contentDescription ="ss"
                    )
                    Row (modifier = Modifier
                        .background(Color.Transparent)

                        .height(60.dp)) {
                        Column (modifier = Modifier
                            .background(Color.Transparent)
                            .align(Alignment.CenterVertically)


                            ) {
                            Text(
                                modifier = Modifier
                                    .padding(1.dp)
                                    .align(Alignment.CenterHorizontally)


                                ,

                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                color = Color.Black,
                                text ="Foco 1".trimIndent()
                            )
                            Text(
                                modifier = Modifier
                                    .padding(1.dp)

                                ,

                                textAlign = TextAlign.Center,

                                fontSize = 15.sp,
                                color = Color.Black,
                                text ="Estimado : 3 meses".trimIndent()
                            )
                        }
                    }

                    

                }






            }
            Spacer(modifier = Modifier.height(1.dp))
            Row (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)

                ,
                horizontalArrangement = Arrangement.spacedBy(100.dp),
            ){


                Column (modifier = Modifier.background(Color.Transparent)){
                    Image(
                        modifier = Modifier

                            .background(Color.Transparent)
                            .size(60.dp)
                            .align(Alignment.CenterHorizontally)
                            .clip(
                                RoundedCornerShape(
                                    topEnd = 100.dp,
                                    topStart = 100.dp,
                                    bottomEnd = 100.dp,
                                    bottomStart = 100.dp
                                )
                            )
                        ,
                        painter = painterResource(R.drawable.imagen_2),
                        contentDescription ="ss"
                    )
                    Row (modifier = Modifier
                        .background(Color.Transparent)

                        .height(60.dp)) {
                        Column (modifier = Modifier
                            .background(Color.Transparent)
                            .align(Alignment.CenterVertically)


                        ) {
                            Text(
                                modifier = Modifier
                                    .padding(1.dp)
                                    .align(Alignment.CenterHorizontally)


                                ,

                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                color = Color.Black,
                                text ="Foco 2".trimIndent()
                            )
                            Text(
                                modifier = Modifier
                                    .padding(1.dp)

                                ,

                                textAlign = TextAlign.Center,

                                fontSize = 15.sp,
                                color = Color.Black,
                                text ="Estimado : 3 meses".trimIndent()
                            )
                        }
                    }



                }






            }
            Spacer(modifier = Modifier.height(1.dp))
            Row (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)

                ,
                horizontalArrangement = Arrangement.spacedBy(100.dp),
            ){


                Column (modifier = Modifier.background(Color.Transparent)){
                    Image(
                        modifier = Modifier

                            .background(Color.Transparent)
                            .size(60.dp)
                            .align(Alignment.CenterHorizontally)
                            .clip(
                                RoundedCornerShape(
                                    topEnd = 100.dp,
                                    topStart = 100.dp,
                                    bottomEnd = 100.dp,
                                    bottomStart = 100.dp
                                )
                            )
                        ,
                        painter = painterResource(R.drawable.imagen_2),
                        contentDescription ="ss"
                    )
                    Row (modifier = Modifier
                        .background(Color.Transparent)

                        .height(60.dp)) {
                        Column (modifier = Modifier
                            .background(Color.Transparent)
                            .align(Alignment.CenterVertically)


                        ) {
                            Text(
                                modifier = Modifier
                                    .padding(1.dp)
                                    .align(Alignment.CenterHorizontally)


                                ,

                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                color = Color.Black,
                                text ="Foco 3".trimIndent()
                            )
                            Text(
                                modifier = Modifier
                                    .padding(1.dp)

                                ,

                                textAlign = TextAlign.Center,

                                fontSize = 15.sp,
                                color = Color.Black,
                                text ="Estimado : 3 meses".trimIndent()
                            )
                        }
                    }



                }






            }








        }
    }

}