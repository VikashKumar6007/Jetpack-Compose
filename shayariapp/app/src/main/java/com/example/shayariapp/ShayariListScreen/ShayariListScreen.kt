package com.example.shayariapp.ShayariListScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.shayariapp.MainToolBar
import com.example.shayariapp.Routing.ShayariRoutingItem
import com.example.shayariapp.getList
import com.example.shayariapp.ui.theme.orangeColor
import com.example.shayariapp.ui.theme.primaryColor
import com.example.shayariapp.ui.theme.purpleColor




@Composable

fun ShayariListScreen(navHostController: NavHostController? = null, title: String?) {
    Surface() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = primaryColor)
        )

        Column {
            MainToolBar(title = title.toString()) {

            }
            val myFinalList = getList().filter {
                it.title == title.toString()
            }
            val finalList = myFinalList[0]


            finalList.list?.let { list ->
                LazyColumn {
                    items(list) { item ->
                        Card(modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp).clickable {
                                navHostController?.navigate(ShayariRoutingItem.finalShayariScreen.route + "/${item}")
                            }, colors = CardDefaults.cardColors(
                                containerColor = purpleColor
                            )) {
                            Text(text = item, color = Color.White , modifier = Modifier.fillMaxSize().padding(15.dp), textAlign = TextAlign.Center , style = TextStyle(fontSize = 16.sp))

                        }
                    }
                }
            }
        }



    }
}