package com.example.uicheckpoint1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Composition
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Checkbox
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.uicheckpoint1.ui.theme.ScaffoldLayout
import com.example.uicheckpoint1.ui.theme.UICheckpoint1Theme //import scaffold from other file

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val exampleItems = List(12) { index -> "Eintrag ${index + 1}" }

            UICheckpoint1Theme {
                Surface(//not as important for this project
                    modifier = Modifier.fillMaxSize()
                ) {

                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "screen1")
                    {
                        composable("screen1"){ Screen1(navController)}
                        composable("screen2"){ Screen2(navController)}
                    }

                }
            }
        }
    }
}
val exampleItems = List(12) { index -> "Eintrag ${index + 1}" }
@Composable
fun Screen1(navController: NavHostController) {
    ScaffoldLayout(screenHeading = "Test", content = {
        LazyColumn {
            items(exampleItems) { item ->
                ListItem(item)
            }
        }
    }, screenBottomBar = {
        Button(onClick = {navController.navigate("Screen1")}) {
            Text("1")
        }
        Button(onClick = { navController.navigate("Screen2") }) {
            Text("2")
        }
        //ButtonState()
    })
}

@Composable
fun Screen2(navController: NavHostController) {
    ScaffoldLayout(screenHeading = "Test", content = {
        Text(text = "Screen 2")
    }, screenBottomBar = {
        Button(onClick = {navController.navigate("Screen1")}) {
            Text("1")
        }
        Button(onClick = { navController.navigate("Screen2") }) {
            Text("2")
        }
        //ButtonState()
    })
}






