package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                TaskManagerLayout(
                    status = getString(R.string.Status),
                    message = getString(R.string.Message))
                }
            }
        }
    }
}

@Composable
fun TaskManagerLayout(status: String, message: String){
val image = painterResource(R.drawable.ic_task_completed)
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
        )

        Text(
            text = status,
            fontWeight = Bold,
            modifier = Modifier
                .padding(top = 24.dp)
                .padding(bottom = 8.dp)
        )
        Text(
            text = message,
            fontSize = 16.sp
        )
    }

}

@Preview(showBackground = true)
@Composable
fun TaskManagerPreview() {
    TaskManagerTheme {
        TaskManagerLayout(
            status = stringResource(R.string.Status),
            message = stringResource(R.string.Message)
        )
    }
}