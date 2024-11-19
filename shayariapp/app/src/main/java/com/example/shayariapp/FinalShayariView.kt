package com.example.shayariapp

import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ClipboardManager
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavHostController
import com.example.shayariapp.ui.theme.primaryColor
import com.example.shayariapp.ui.theme.purpleColor



@Composable
fun FinalShayariView(finalShayari: String?) {

    Surface {
        val content = LocalContext.current
        val clipboardManager: ClipboardManager = LocalClipboardManager.current

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = primaryColor), contentAlignment = Alignment.Center
        ) {

            Column {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    shape = RoundedCornerShape(15.dp),
                    colors = CardDefaults.cardColors(containerColor = purpleColor),
                    border = BorderStroke(2.dp, color = Color.White)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(25.dp),
                            text = finalShayari.toString(),
                            color = Color.White,
                            style = TextStyle(fontSize = 19.sp),
                            textAlign = TextAlign.Center

                        )
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 12.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Card(
                        modifier = Modifier
                            .size(70.dp, 38.dp)
                            .clickable {
                                // Share text functionality
                                val shareIntent = Intent().apply {
                                    action = Intent.ACTION_SEND
                                    putExtra(Intent.EXTRA_TEXT, finalShayari ?: "")
                                    type = "text/plain"
                                }
                               startActivity(content,shareIntent, null)
                            },
                        colors = CardDefaults.cardColors(containerColor = purpleColor.copy(0.9f)),
                        shape = RoundedCornerShape(100.dp)
                    ) {

                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {

                            Icon(
                                painterResource(id = R.drawable.send),
                                contentDescription = null,
                                tint = Color.White
                            )

                        }
                    }


                    Card(
                        modifier = Modifier
                            .size(70.dp, 38.dp)
                            .clickable {

                                clipboardManager.setText(
                                    androidx.compose.ui.text.AnnotatedString(
                                        finalShayari ?: ""
                                    )
                                )
                                Toast.makeText(content,"Text Copied Successfully",Toast.LENGTH_SHORT).show()
                            },
                        colors = CardDefaults.cardColors(containerColor = purpleColor.copy(0.9f)),
                        shape = RoundedCornerShape(100.dp)
                    ) {

                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {

                            Icon(
                                painterResource(id = R.drawable.copy),
                                contentDescription = null,
                                tint = Color.White
                            )

                        }
                    }
                }

            }


        }
    }
}