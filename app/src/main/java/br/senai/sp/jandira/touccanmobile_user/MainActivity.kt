package br.senai.sp.jandira.touccanmobile_user

import android.graphics.Canvas
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import br.senai.sp.jandira.touccanmobile_user.ui.theme.TouccanMobileUserTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TouccanMobileUserTheme {
                SignUpScreen()
            }
        }
    }
}


@Composable
fun SignUpScreen(modifier: Modifier = Modifier) {

    val linear = Brush.linearGradient(listOf(Color(0xffF07B07), Color(0xffE25401)))
    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(320.dp)
            .background(linear)
){
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.logo_touccan),
                    contentDescription = "",
                    modifier = Modifier
                        .size(300.dp)
                        .offset(y = -20.dp)
                )
            }
        }

        Canvas(modifier = Modifier
            .fillMaxSize()
            .offset(y = 1515.dp, x = 3955.dp)
) {
            rotate(degrees = 114F) {
                drawRoundRect(
                    color = Color.White,
                    topLeft = Offset(x = size.width / 3F, y = size.height / 3F),
                    size = size / 0.1F,
                    cornerRadius = CornerRadius(290f)
                )
            }
        }

        Column () {
            Text(text = "Cadastro")
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    TouccanMobileUserTheme {
        SignUpScreen()
    }
}