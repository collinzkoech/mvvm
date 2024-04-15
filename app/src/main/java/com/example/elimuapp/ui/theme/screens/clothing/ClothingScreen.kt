package com.example.elimuapp.ui.theme.screens.clothing

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.elimuapp.R
import com.example.elimuapp.ui.theme.lBlue


@Composable
fun ClothingScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            title = { Text(text = "Clothes") },
            backgroundColor = lBlue
        )

        //Box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.cloth
                ),
                contentDescription = "Clothing",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column {

                Text(
                    text = "WINTER COLLECTION",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(start = 20.dp)

                )
                Text(
                    text = "Purchase Your Clothes",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        } //End of Box
        Spacer(modifier = Modifier.height(10.dp))
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(20.dp)
        ) {
            //start of row 1
            Row {
                //start of column 1
                Column {


                    Image(
                        painter = painterResource(
                            id = R.drawable.dress
                        ),
                        contentDescription = "Clothing",
                        modifier = Modifier.size(width = 180.dp, height = 200.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Shirt1",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                    

                    )
                    Text(
                        text = "Ksh 1300",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    OutlinedButton(onClick = { /*TODO*/ }) {
                        Text(text = "Pay", color = Color.Blue)
                        
                    }
                }//end of column1
                Spacer(modifier = Modifier.width(15.dp))
                //start of column 2
                Column {


                    Image(
                        painter = painterResource(
                            id = R.drawable.dreser

                        ),
                        contentDescription = "Clothing",
                        modifier = Modifier.size(width = 180.dp, height = 200.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Shirt2",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,


                        )
                    Text(
                        text = "Ksh 1300",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    OutlinedButton(onClick = { /*TODO*/ }) {
                        Text(text = "Pay", color = Color.Blue)

                    }
                }
                //end of column 2
            }
            //end of row 1
            Spacer(modifier = Modifier.height(10.dp))
            //start of row 2

            Row {
                //start of column 1
                Column {


                    Image(
                        painter = painterResource(
                            id = R.drawable.dresss
                        ),
                        contentDescription = "Clothing",
                        modifier = Modifier.size(width = 180.dp, height = 200.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Shirt1",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,


                        )
                    Text(
                        text = "Ksh 1300",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    OutlinedButton(onClick = { /*TODO*/ }) {
                        Text(text = "Pay", color = Color.Blue)

                    }
                }//end of column1
                Spacer(modifier = Modifier.width(15.dp))
                //start of column 2
                Column {


                    Image(
                        painter = painterResource(
                            id = R.drawable.skirt
                        ),
                        contentDescription = "Clothing",
                        modifier = Modifier.size(width = 180.dp, height = 200.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Shirt1",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,


                        )
                    Text(
                        text = "Ksh 1300",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    OutlinedButton(onClick = { /*TODO*/ }) {
                        Text(text = "Pay", color = Color.Blue)

                    }
                }
                //end of column 2
            }
            //end of row 2
            Spacer(modifier = Modifier.height(10.dp))
            //start of row 2

            Row {
                //start of column 1
                Column {


                    Image(
                        painter = painterResource(
                            id = R.drawable.sikrt
                        ),
                        contentDescription = "Clothing",
                        modifier = Modifier.size(width = 180.dp, height = 200.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Shirt1",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,


                        )
                    Text(
                        text = "Ksh 1300",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    OutlinedButton(onClick = { /*TODO*/ }) {
                        Text(text = "Pay", color = Color.Blue)

                    }
                }//end of column1
                Spacer(modifier = Modifier.width(15.dp))
                //start of column 2
                Column {


                    Image(
                        painter = painterResource(
                            id = R.drawable.dress
                        ),
                        contentDescription = "Clothing",
                        modifier = Modifier.size(width = 180.dp, height = 200.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Shirt1",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,


                        )
                    Text(
                        text = "Ksh 1300",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                    OutlinedButton(onClick = { /*TODO*/ }) {
                        Text(text = "Pay", color = Color.Blue)

                    }
                }
                //end of column 2
            }
            //end of row 2
        }
    }
}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    ClothingScreen(rememberNavController())
}
