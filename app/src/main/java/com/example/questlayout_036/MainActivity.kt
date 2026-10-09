package com.example.questlayout_036

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.questlayout_036.ui.theme.QuestLayout_036Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestLayout_036Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ActivityPertama(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
//