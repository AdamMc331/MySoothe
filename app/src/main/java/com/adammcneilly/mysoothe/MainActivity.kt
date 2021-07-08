package com.adammcneilly.mysoothe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.adammcneilly.mysoothe.ui.theme.MySootheTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val title = remember {
                mutableStateOf("MySoothe")
            }

            MySootheTheme {
                Scaffold(
                    topBar = {
                        MySootheToolbar(title.value)
                    }
                ) {
                    Box(
                        modifier = Modifier.padding(it),
                    ) {
                        AppContent(
                            titleChanged = { newTitle ->
                                title.value = newTitle
                            },
                        )
                    }
                }
            }
        }
    }

    @Composable
    private fun MySootheToolbar(title: String) {
        TopAppBar(
            title = {
                Text(title)
            }
        )
    }

    @Composable
    private fun AppContent(
        titleChanged: (String) -> Unit,
    ) {
        val navController = rememberNavController()

        NavHost(navController, startDestination = "welcome") {
            composable("welcome") {
                titleChanged.invoke("MySoothe")

                WelcomeScreen(
                    loginButtonClicked = {
                        navController.navigate("login")
                    }
                )
            }
            composable("login") {
                titleChanged.invoke("Login")

                LoginScreen(
                    loginButtonClicked = {
                        navController.navigate("home")
                    }
                )
            }
            composable("home") {
                titleChanged.invoke("Home")

                HomeScreen()
            }
        }
    }
}
