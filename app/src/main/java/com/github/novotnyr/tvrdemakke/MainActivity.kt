package com.github.novotnyr.tvrdemakke

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var wordTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wordTextView = findViewById(R.id.wordTextView)
    }

    fun onYButtonClick(view: View) {
        Toast.makeText(this, "Klikli ste na ypsilon", Toast.LENGTH_SHORT)
            .show()
    }
    fun onIButtonClick(view: View) {
        Toast.makeText(this, "Klikli ste na mäkké i", Toast.LENGTH_SHORT)
            .show()
    }
}