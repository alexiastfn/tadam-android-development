package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lemonade.ui.theme.LemonadeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LemonadeTheme {
                LemonApp()
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LemonadeTheme {
        LemonApp(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.Center)
        )
    }
}

@Composable
fun LemonApp(modifier: Modifier = Modifier) {
    var result by remember { mutableStateOf(1) }
    val imageResource = when (result) {
        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        3 -> R.drawable.lemon_drink
        4 -> R.drawable.lemon_restart
        else -> R.drawable.lemon_tree
    }

    val textResource = when (result) {
        1 -> stringResource(R.string.tap_the_lemon_tree_to_select_a_lemon)
        2 -> stringResource(R.string.keep_tapping_the_lemon_to_squeeze_it)
        3 -> stringResource(R.string.tap_the_lemonade_to_drink_it)
        4 -> stringResource(R.string.tap_the_empty_glass_to_start_again)
        else -> stringResource(R.string.tap_the_lemon_tree_to_select_a_lemon)
    }

    val descriptionResource = when (result) {
        1 -> stringResource(R.string.lemon_tree)
        2 -> stringResource(R.string.lemon)
        3 -> stringResource(R.string.glass_of_lemonade)
        4 -> stringResource(R.string.empty_glass)
        else -> stringResource(R.string.lemon_tree)
    }


    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {

        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(300.dp))
            Button(
                onClick = {result = cycleResult(result)},
                shape = androidx.compose.foundation.shape.RoundedCornerShape(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                )
            ) {
                Image(
                    painter = painterResource(imageResource),
                    contentDescription = descriptionResource
                )
            }

            Spacer(modifier = Modifier.height(30.dp))
            Text(textResource)


        }

    }

}

fun cycleResult(result: Int) : Int {
    if (result < 4)
        return (result + 1)
    else
        return 1
}


fun randomNumberofSqueezes(head: Boolean): Int {
    val nrOfSqueezes = (2..4).random()
    return nrOfSqueezes
}