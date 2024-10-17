package com.naixin.introductioncard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.naixin.introductioncard.ui.theme.IntroductionCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntroductionCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    GreetingPreview();
                }
            }
        }
    }
}

@Composable
fun ContactCard(githubUsername: String, email: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement= Arrangement.spacedBy(2.dp),
            modifier = Modifier
                .height(30.dp)
                .padding(3.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.poste),
                contentDescription = null
            )
            Text(
                text = "$email"
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement= Arrangement.spacedBy(2.dp),
            modifier = Modifier
                .height(30.dp)
                .padding(3.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.github_light),
                contentDescription = null,
            )
            Text(
                text = "https://github.com/$githubUsername"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IntroductionCardTheme {
        ContactCard("naixin9393", "naixin.chen101@alu.ulpgc.es")
    }
}