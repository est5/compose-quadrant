package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background) {
                    Column(Modifier.fillMaxWidth()) {
                        Row(Modifier.weight(1f)) {
                            ColoredBox(color = Color.Green,
                                title = stringResource(R.string.green_title),
                                paragraph = stringResource(R.string.green_para),
                                modifier = Modifier.weight(1f))
                            ColoredBox(color = Color.Yellow,
                                title = stringResource(R.string.yellow_title),
                                paragraph = stringResource(R.string.yellow_para),
                                modifier = Modifier.weight(1f))

                        }
                        Row(Modifier.weight(1f)) {
                            ColoredBox(color = Color.Cyan,
                                title = stringResource(R.string.cyan_title),
                                paragraph = stringResource(R.string.cyan_para),
                                modifier = Modifier.weight(1f))
                            ColoredBox(color = Color.LightGray,
                                title = stringResource(R.string.gray_title),
                                paragraph = stringResource(R.string.gray_para),
                                modifier = Modifier.weight(1f))
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ColoredBox(color: Color, title: String, paragraph: String, modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(color),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = title,
                modifier = Modifier
                    .padding(bottom = 16.dp),
                fontWeight = FontWeight(700),
            )
            Text(text = paragraph,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(16.dp))
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
        Column() {
            Row {
                ColoredBox(color = Color.Green,
                    title = stringResource(R.string.green_title),
                    paragraph = stringResource(R.string.green_para))
                ColoredBox(color = Color.Yellow,
                    title = stringResource(R.string.yellow_title),
                    paragraph = stringResource(R.string.yellow_para))
            }
            Row {
                ColoredBox(color = Color.Cyan,
                    title = stringResource(R.string.cyan_title),
                    paragraph = stringResource(R.string.cyan_para))
                ColoredBox(color = Color.LightGray,
                    title = stringResource(R.string.gray_title),
                    paragraph = stringResource(R.string.gray_para))
            }
        }
    }
}