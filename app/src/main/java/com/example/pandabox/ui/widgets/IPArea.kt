package com.example.pandabox.ui.widgets

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pandabox.ui.theme.PandaBoxTheme
import com.example.pandabox.utils.getLocalIpAddress

var textState by mutableStateOf(getLocalIpAddress())

@Composable
fun IPArea(name: String, modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier.height(100.dp)
    ) {
        Text(
            text = textState,
            modifier = modifier
        )
        Box(
            modifier = Modifier
                .width(400.dp)
                .padding(horizontal = 60.dp)
        ) {
            Button(
                onClick = { textState = getLocalIpAddress() },
                modifier = Modifier
                    .height(50.dp)
                    .width(120.dp)
            ) {
                Text("Refresh")
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PandaBoxTheme {
        IPArea("Android")
    }
}
