package com.example.jetpackcomposetutorialapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorialapp.ui.theme.JetpackComposeTutorialAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticleLayout(
                        title = getString(R.string.Title),
                        description = getString(R.string.Description),
                        content = getString(R.string.Content)
                    )
                }
            }
        }
    }
}
@Composable
fun ArticleLayout(title: String, description: String, content: String) {
val image = painterResource(R.drawable.bg_compose_background)
    Column(modifier = Modifier.fillMaxWidth()) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(start = 16.dp)
                .padding(end = 16.dp)
                .padding(bottom = 16.dp)
                .padding(top = 16.dp)
        )
        Text(
            text = description,
            fontSize = 15.sp,
            modifier = Modifier
                .padding(start = 16.dp)
                .padding(end = 16.dp)

        )
        Text(
            text = content,
            fontSize = 15.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp)
                .padding(end = 16.dp)
                .padding(bottom = 16.dp)
                .padding(top = 16.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun ArticleLayoutPreview() {
    JetpackComposeTutorialAppTheme {
    ArticleLayout(
        title = stringResource(R.string.Title),
        description = stringResource(R.string.Description) ,
        content = stringResource(R.string.Content)
    )
    }
}