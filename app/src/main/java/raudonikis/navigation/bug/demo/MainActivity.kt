package raudonikis.navigation.bug.demo

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidView(
                factory = { context ->
                    LayoutInflater.from(context).inflate(R.layout.layout_nav_graph, null)
                },
                modifier = Modifier.fillMaxSize(),
            )
        }
    }
}
