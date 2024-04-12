package com.example.firebasestorage.ui.theme.screens.dashboard

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
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.R
import com.example.firebasestorage.ui.theme.lBlue

@Composable
fun DashboardScreen(navController: NavController){
Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar(title ={ Text(text = "Amazon Shop")},
            backgroundColor = lBlue,)
    //END OF toPAppBAr
    Spacer(modifier = Modifier.height(30.dp))
    Row (modifier = Modifier.padding(start = 20.dp)){
        Column {
            Text(text = "Amazon", fontSize = 30.sp,
                color = lBlue,
                fontFamily = FontFamily.Serif)
            Text(text = "Shop from A to Z", fontSize = 10.sp)
        }
        Spacer(modifier = Modifier.width(100.dp))
        Image(painter = painterResource(id = R.drawable.amazon),
            contentDescription = "amazon",
            modifier = Modifier.size(90.dp))
    }
    //END OF ROW
    Spacer(modifier = Modifier.height(30.dp))
    Column(modifier = Modifier.padding(start = 10.dp)) {
        //Row 1
        Row {
            Card(modifier = Modifier.size(width = 150.dp, height = 120.dp)) {

                Column {
                    Box(modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.clothing),
                            contentDescription = "amazon",
                            modifier = Modifier.size(50.dp))
                    }
                    Text(text = "Clothing",
                        fontSize = 20.sp,
                        color = lBlue,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }

            }
            Spacer(modifier = Modifier.width(20.dp))
            Card(modifier = Modifier.size(width = 150.dp, height = 120.dp)) {

                Column {
                    Box(modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.electronic),
                            contentDescription = "amazon",
                            modifier = Modifier.size(50.dp))
                    }
                    Text(text = "Electronics",
                        fontSize = 20.sp,
                        color = lBlue,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }

            }



        }
        //End of Row 1
        Spacer(modifier = Modifier.height(10.dp))
//Row 2
        Row {
            Card(modifier = Modifier.size(width = 150.dp, height = 120.dp)) {

                Column {
                    Box(modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.hhome),
                            contentDescription = "amazon",
                            modifier = Modifier.size(50.dp))
                    }
                    Text(text = "Home",
                        fontSize = 20.sp,
                        color = lBlue,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }

            }
            Spacer(modifier = Modifier.width(20.dp))
            Card(modifier = Modifier.size(width = 150.dp, height = 120.dp)) {

                Column {
                    Box(modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.beauty),
                            contentDescription = "amazon",
                            modifier = Modifier.size(50.dp))
                    }
                    Text(text = "Beauty",
                        fontSize = 20.sp,
                        color = lBlue,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }

            }



        }
        //End of Row 2

        Spacer(modifier = Modifier.height(10.dp))
//Row 3
        Row {
            Card(modifier = Modifier.size(width = 150.dp, height = 120.dp),
                elevation = 20.dp) {

                Column {
                    Box(modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.pharmacy),
                            contentDescription = "amazon",
                            modifier = Modifier.size(50.dp))
                    }
                    Text(text = "Pharmacy",
                        fontSize = 20.sp,
                        color = lBlue,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }

            }
            Spacer(modifier = Modifier.width(20.dp))
            Card(modifier = Modifier.size(width = 150.dp, height = 120.dp)) {

                Column {
                    Box(modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.groceries),
                            contentDescription = "amazon",
                            modifier = Modifier.size(50.dp))
                    }
                    Text(text = "Groceries",
                        fontSize = 20.sp,
                        color = lBlue,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }

            }



        }
        //End of Row 3



    }
}
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DashboardPreview(){
DashboardScreen(rememberNavController())
}
