package mx.ipn.upiicsa.programacionmovil.citas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import mx.ipn.upiicsa.programacionmovil.citas.ui.login.LoginScreen
import mx.ipn.upiicsa.programacionmovil.citas.ui.theme.CitasTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            CitasTheme {
                LoginScreen()
            }
        }
    }
}
