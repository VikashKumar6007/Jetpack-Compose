package com.example.shayariapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shayariapp.ui.theme.primaryColor
import com.example.shayariapp.ui.theme.purpleColor

@Composable
@Preview
fun SplashScreen() {
    Surface() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = primaryColor)
        )
        {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
            {

                Image(
                    painterResource(id = R.drawable.logo),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
            }
            Box(modifier = Modifier.fillMaxSize().padding(20.dp) , contentAlignment = Alignment.BottomCenter)
            {
                CircularProgressIndicator(modifier = Modifier.size(35.dp) , strokeWidth = 4.dp , color = purpleColor)
            }
        }
    }
}