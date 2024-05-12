package com.example.uicheckpoint1.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun ScaffoldLayoutPreview() {
    ScaffoldLayout(
        screenHeading = "Test",
        content = { Text(text = "HI") },
        screenBottomBar = {
            Button(onClick = { /*TODO*/ }) {
                Text("Button")
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldLayout(screenHeading: String, content: @Composable () -> Unit, screenBottomBar: @Composable () -> Unit) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(screenHeading)
                },
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            )
        },

        content = {values ->
            Column(Modifier.padding(values)) {
                content()
            }
        },

        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary,
            ) {
                screenBottomBar()
            }
        },

        floatingActionButton = {
            FloatingActionButton(onClick = {/* TODO -> Navigation */},
                //containerColor = MaterialTheme.colorScheme.tertiary
                //shape = MaterialTheme.shapes.small
                ){
                Icon(
                    Icons.Default.Favorite,
                    contentDescription = "Add",
                    //tint = MaterialTheme.colorScheme.onPrimary
                )
            }
        }
    )
}