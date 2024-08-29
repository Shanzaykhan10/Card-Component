package com.project.cardcomponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.cardcomponent.R

@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun CardComponent() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Card component", fontWeight = FontWeight.Bold,
            fontSize = 25.sp)
        Card(colors =  CardDefaults.cardColors(Color(0xFF29C6DA)),
            modifier = Modifier
                .padding(
                    horizontal = 10.dp,
                    vertical = 10.dp
                )
                .shadow(5.dp, shape = RoundedCornerShape(CornerSize(10.dp)))
        ) {
            Row {
                Image(
                    painter = painterResource(id = R.drawable.java_logo_1),
                    contentDescription = "My pic",
                    modifier = Modifier
                        .padding(10.dp)
                        .size(150.dp)
                        .align(Alignment.CenterVertically)
                        .clip(RoundedCornerShape(CornerSize(10.dp)))
                )
                Column(modifier = Modifier.padding(8.dp)) {
                    Text(text = "Java",
                        fontSize = 27.sp,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(bottom = 10.dp))
                    Text(text = "Java is a high-level, class-based, object-oriented programming language" +
                            " that is designed to have as few implementation dependencies as possible.",
                        fontSize = 15.sp,
                        textAlign = TextAlign.Left,
                    )
                }
            }
        }
        Card(colors =  CardDefaults.cardColors(Color(0xFFBD728B)),
            modifier = Modifier
                .padding(
                    horizontal = 10.dp,
                    vertical = 10.dp)
                .shadow(5.dp, shape = RoundedCornerShape(CornerSize(10.dp))  )
        ) {
            Row {
                Image(
                    painter = painterResource(id = R.drawable.kotlin_icon),
                    contentDescription = "My pic",
                    modifier = Modifier
                        .padding(25.dp)
                        .size(140.dp)
                        .align(Alignment.CenterVertically)
                        .clip(RoundedCornerShape(CornerSize(10.dp)))
                )
                Column(modifier = Modifier.padding(8.dp)) {
                    Text(text = "Kotlin",
                        fontSize = 27.sp,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(bottom = 10.dp))
                    Text(
                        text = "Kotlin is a modern programming language that combines the best of both worlds: " +
                                "the conciseness and expressiveness of dynamic languages."
                        , fontSize = 15.sp,
                        textAlign = TextAlign.Left
                    )
                }
            }
        }
    }
}