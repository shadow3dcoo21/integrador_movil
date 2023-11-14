package com.example.laboratorio8

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.Proyecto__.R

@RequiresApi(Build.VERSION_CODES.O)
@SuppressLint("")
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun Dispositivos_conectados(navController: NavHostController) {
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
                modifier = Modifier.height(60.dp),
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
                    text = "Lista de artefactos".trimIndent()



                )
            }
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                ,

                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = Color.Black,
                text = "Dispositivos Conectados".trimIndent()
            )
            Row (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)

                ,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
            ){

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
                    painter = painterResource(R.drawable.imagen_2),
                    contentDescription ="ss"
                )
                Column (){
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
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
                        text ="Encendido".trimIndent()
                    )
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
                        ,

                        textAlign = TextAlign.Center,

                        fontSize = 15.sp,
                        color = Color.Black,
                        text ="Consumo: 100kWh".trimIndent()
                    )
                }


                FloatingActionButton(modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .height(35.dp)
                    .background(Color.Black)
                    .padding(1.dp)
                    .clip(
                        RoundedCornerShape(
                            topEnd = 100.dp,
                            topStart = 100.dp,
                            bottomEnd = 100.dp,
                            bottomStart = 100.dp
                        )
                    )


                    ,
                    onClick = { /* do something */ },
                    containerColor = color_mass,
                    elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                ) {
                    Text(
                        modifier = Modifier
                            .height(25.dp)


                            .padding(horizontal = 15.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .clickable { navController.navigate("pantalla6") }
                        ,

                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.White,
                        text ="DETALLES".trimIndent()
                    )
                }



            }
            Row (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)

                ,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
            ){

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
                    painter = painterResource(R.drawable.imagen_2),
                    contentDescription ="ss"
                )
                Column (){
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
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
                        text ="Encendido".trimIndent()
                    )
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
                        ,

                        textAlign = TextAlign.Center,

                        fontSize = 15.sp,
                        color = Color.Black,
                        text ="Consumo: 100kWh".trimIndent()
                    )
                }


                FloatingActionButton(modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .height(35.dp)
                    .background(Color.Black)
                    .padding(1.dp)
                    .clip(
                        RoundedCornerShape(
                            topEnd = 100.dp,
                            topStart = 100.dp,
                            bottomEnd = 100.dp,
                            bottomStart = 100.dp
                        )
                    )


                    ,
                    onClick = { /* do something */ },
                    containerColor = color_mass,
                    elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                ) {
                    Text(
                        modifier = Modifier
                            .height(25.dp)


                            .padding(horizontal = 15.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .clickable { navController.navigate("pantalla6") }
                        ,

                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.White,
                        text ="DETALLES".trimIndent()
                    )
                }



            }
            Row (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)

                ,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
            ){

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
                    painter = painterResource(R.drawable.imagen_2),
                    contentDescription ="ss"
                )
                Column (){
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
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
                        text ="Encendido".trimIndent()
                    )
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
                        ,

                        textAlign = TextAlign.Center,

                        fontSize = 15.sp,
                        color = Color.Black,
                        text ="Consumo: 100kWh".trimIndent()
                    )
                }


                FloatingActionButton(modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .height(35.dp)
                    .background(Color.Black)
                    .padding(1.dp)
                    .clip(
                        RoundedCornerShape(
                            topEnd = 100.dp,
                            topStart = 100.dp,
                            bottomEnd = 100.dp,
                            bottomStart = 100.dp
                        )
                    )


                    ,
                    onClick = { /* do something */ },
                    containerColor = color_mass,
                    elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                ) {
                    Text(
                        modifier = Modifier
                            .height(25.dp)


                            .padding(horizontal = 15.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .clickable { navController.navigate("pantalla6") }
                        ,

                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.White,
                        text ="DETALLES".trimIndent()
                    )
                }



            }
            Row (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)

                ,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
            ){

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
                    painter = painterResource(R.drawable.imagen_2),
                    contentDescription ="ss"
                )
                Column (){
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
                        ,

                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.Black,
                        text ="Foco 4".trimIndent()
                    )
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
                        ,

                        textAlign = TextAlign.Center,

                        fontSize = 15.sp,
                        color = Color.Black,
                        text ="Encendido".trimIndent()
                    )
                    Text(
                        modifier = Modifier
                            .padding(1.dp)
                        ,

                        textAlign = TextAlign.Center,

                        fontSize = 15.sp,
                        color = Color.Black,
                        text ="Consumo: 100kWh".trimIndent()
                    )
                }


                FloatingActionButton(modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .height(35.dp)
                    .background(Color.Black)
                    .padding(1.dp)
                    .clip(
                        RoundedCornerShape(
                            topEnd = 100.dp,
                            topStart = 100.dp,
                            bottomEnd = 100.dp,
                            bottomStart = 100.dp
                        )
                    )


                    ,
                    onClick = { /* do something */ },
                    containerColor = color_mass,
                    elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                ) {
                    Text(
                        modifier = Modifier
                            .height(25.dp)


                            .padding(horizontal = 15.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .clickable { navController.navigate("pantalla6") }
                        ,

                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        color = Color.White,
                        text ="DETALLES".trimIndent()
                    )
                }



            }
            Spacer(modifier = Modifier.height(6.dp))
            Column(modifier= Modifier.background(Color.Transparent).fillMaxWidth()) {
                Row(
                    modifier = Modifier.height(60.dp).background(Color.Transparent).width(300.dp).align(
                        Alignment.CenterHorizontally
                    ).border(2.dp, Color.Black).clip(RoundedCornerShape(50)),
                    horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.Start),

                ){
                    Text(

                        modifier = Modifier.align(Alignment.CenterVertically)
                            .fillMaxWidth()
                            .clickable { navController.navigate("pantalla3") }
                        ,

                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,

                        fontSize = 13.sp,
                        color = Color(0xFF000000),
                        text = "PROGRAMACION HORARIA".trimIndent()



                    )
                }
            }

            Column(modifier= Modifier.background(Color.Transparent).fillMaxWidth()) {
                Row(
                    modifier = Modifier.height(60.dp).background(Color.Transparent).width(300.dp).align(
                        Alignment.CenterHorizontally
                    ).border(2.dp, Color.Black).clip(RoundedCornerShape(50)),
                    horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.Start),

                    ){
                    Text(

                        modifier = Modifier.align(Alignment.CenterVertically)
                            .fillMaxWidth()
                            .clickable { navController.navigate("pantalla4") }
                        ,

                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,

                        fontSize = 13.sp,
                        color = Color(0xFF000000),
                        text = "VIDA UTIL".trimIndent()



                    )
                }
            }






        }
    }

}