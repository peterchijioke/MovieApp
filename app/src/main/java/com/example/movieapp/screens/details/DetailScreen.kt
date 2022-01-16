package com.example.movieapp.screens.details

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.movieapp.screens.MainContent

@Composable
fun DetailScreen(navController: NavController, movieData: String?){
Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
)
{

    Scaffold(topBar = {
        TopAppBar(backgroundColor = Color.Transparent,
            elevation = 0.dp) {
            Row(horizontalArrangement = Arrangement.Start) {
                Icon(imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back Arrow", modifier = Modifier.clickable {
                        navController.popBackStack()
                    })
                
            }
            Spacer(modifier = Modifier.width(100.dp))
            Text(text = "Movie")
        }
    }) {
        Surface(modifier = Modifier.fillMaxWidth().fillMaxHeight()) {
            Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center)
            {
                Text(text = movieData.toString(), style = MaterialTheme.typography.h5)
                Spacer(modifier = Modifier.height(23.dp))
            }

        }
    }


}
}