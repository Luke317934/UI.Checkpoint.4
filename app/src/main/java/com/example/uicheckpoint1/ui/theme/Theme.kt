package com.example.uicheckpoint1.ui.theme


import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val darkColorScheme = darkColorScheme(
    //primary = Purple80,
    //secondary = PurpleGrey80,
    //tertiary = Pink80
)

private val lightColorScheme = lightColorScheme(
    //primary = Purple40,
    //secondary = PurpleGrey40,
    //tertiary = Pink40
)


//no dynamic colors
@Composable
fun UICheckpoint1Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) darkColorScheme else lightColorScheme

    MaterialTheme(
      colorScheme = colorScheme,
      typography = Typography,
      content = content
    )
}