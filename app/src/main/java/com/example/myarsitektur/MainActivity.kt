package com.example.myarsitektur

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.example.myarsitektur.ui.theme.MyArsitekturTheme
import com.example.myarsitektur.view.uicontroller.SiswaApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            MyArsitekturTheme {
                SiswaApp()   // ⬅️ LANGSUNG PANGGIL NAVIGASI UTAMA
            }
        }
    }
}
