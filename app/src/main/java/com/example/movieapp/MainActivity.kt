package com.example.movieapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.movieapp.navigation.MovieNavigation
import com.example.movieapp.ui.theme.MovieAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        MyApp {
            MovieNavigation()
        }
        }
    }
}


@Composable
fun MyApp(content: @Composable ()->Unit){
    MovieAppTheme {
        content()
    }
}




@Composable
fun MovieRow(movie:String,onItemClick: (String)->Unit={}){
    Card(modifier = Modifier
        .padding(4.dp)
        .fillMaxWidth()
        .height(130.dp)
        .clickable {
            onItemClick(movie)
        }, elevation = 6.dp,
        shape = RoundedCornerShape(corner = CornerSize(16.dp))) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Surface(modifier = Modifier
                .padding(12.dp)
                .size(100.dp),
                shape = RectangleShape,
                elevation = 4.dp) {
                Icon(imageVector = Icons.Default.AccountBox, contentDescription = "User account")

            }
            Text(text = movie)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
        MyApp {
            MovieNavigation()
        }
}