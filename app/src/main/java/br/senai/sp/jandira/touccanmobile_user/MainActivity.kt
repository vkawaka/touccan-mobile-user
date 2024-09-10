package br.senai.sp.jandira.touccanmobile_user

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.touccanmobile_user.screens.SetPassword
import br.senai.sp.jandira.touccanmobile_user.screens.SignUpScreen
import br.senai.sp.jandira.touccanmobile_user.ui.theme.TouccanMobileUserTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TouccanMobileUserTheme {
                Surface(color = Color(0xffEBEBEB)) {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "signUp") {
                        composable(route = "signUp"){ SignUpScreen(navController)}
                        composable(route = "setPassword"){ SetPassword(navController)}
                        }
                    }
                }
                }
            }
        }



//    @Preview(showBackground = true, showSystemUi = true)
//    @Composable
//    fun SignUpScreenPreview() {
//        TouccanMobileUserTheme {
//            SignUpScreen()
//        }
//    }
//}