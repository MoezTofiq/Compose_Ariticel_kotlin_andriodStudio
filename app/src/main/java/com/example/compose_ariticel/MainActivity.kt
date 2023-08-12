package com.example.compose_ariticel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_ariticel.ui.theme.Compose_AriticelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_AriticelTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Page(
                        title = stringResource(R.string.title),
                        body = stringResource(R.string.body),
                        body2 = stringResource(
                            R.string.body2
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun Page(title: String, body: String, body2: String) {
//    this is the entire page :
    val image = painterResource(R.drawable.bg_compose_background) // getting the image from project

    Column {
        Image(painter = image, contentDescription = null, contentScale = ContentScale.FillWidth)
        Text(text = title, modifier = Modifier.padding(16.dp), fontSize = 24.sp)
        Text(
            text = body,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(text = body2, modifier = Modifier.padding(16.dp), textAlign = TextAlign.Justify)

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Compose_AriticelTheme {
        Page(
            title = stringResource(R.string.title),
            body = stringResource(R.string.body),
            body2 = stringResource(
                R.string.body2
            )
        )
    }
}