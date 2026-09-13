package com.example.lr1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.lr1.ui.theme.Lr1Theme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {

            Lr1Theme {

                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    DemoScreen(
                        modifier = Modifier.padding(innerPadding)
                    )

                }

            }

        }

    }

}



@Composable
fun DemoText(
    message: String,
    fontSize: Float
) {

    Text(
        text = message,
        fontSize = fontSize.sp,
        fontWeight = FontWeight.Bold
    )

}



@Composable
fun DemoSlider(
    sliderPosition: Float,
    onPositionChange: (Float) -> Unit
) {

    Slider(

        modifier = Modifier.padding(10.dp),

        valueRange = 20f..38f,

        value = sliderPosition,

        onValueChange = onPositionChange

    )

}



@Composable
fun DemoScreen(
    modifier: Modifier = Modifier
) {

}