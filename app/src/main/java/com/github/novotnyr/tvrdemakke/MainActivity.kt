package com.github.novotnyr.tvrdemakke

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var wordTextView: TextView

    var letterGuessing = LetterGuessing()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wordTextView = findViewById(R.id.wordTextView)
        if (savedInstanceState == null) {
            resetGame()
        } else {
            letterGuessing = savedInstanceState["letterGuessing"] as LetterGuessing
            wordTextView.text = letterGuessing.getChallenge()
        }
    }

    fun resetGame() {
        letterGuessing.newGame()
        wordTextView.text = letterGuessing.getChallenge()
    }

    fun guess(letter: String) {
        val message = if (letterGuessing.guess(letter)) {
            "Uhádli ste!"
        } else {
            "Žiaľ, voľba je nesprávna"
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT)
            .show()
        resetGame()
    }

    fun onYButtonClick(view: View) {
        guess("y")
    }

    fun onIButtonClick(view: View) {
        guess("i")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putSerializable("letterGuessing", letterGuessing)
    }
}