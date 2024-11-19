package com.example.shayariapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shayariapp.ui.theme.primaryColor
import com.example.shayariapp.ui.theme.purpleColor

@Composable
@Preview
fun CategoryScreen() {
    Surface() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = primaryColor)
        ) {

            Column() {
                MainToolBar(title = "Category", {})


                LazyColumn() {
                    items(getList()) {item->

                        Card(
                            shape = RoundedCornerShape(15.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(85.dp)
                                .padding(start = 15.dp , end = 15.dp , top = 15.dp),
                            colors = CardDefaults.cardColors(containerColor = purpleColor)
                        ) {
                            Box (modifier = Modifier.fillMaxSize() , contentAlignment = Alignment.Center){
                                Text(text = item.title.toString(), style = TextStyle(fontWeight = FontWeight.Bold , fontSize = 20.sp), color = Color.White)

                            }
                        }
                    }
                }
            }

        }

    }
}