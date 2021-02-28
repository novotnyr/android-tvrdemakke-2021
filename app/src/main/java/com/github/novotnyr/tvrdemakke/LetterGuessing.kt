package com.github.novotnyr.tvrdemakke

class LetterGuessing {
    private val words = listOf("syr", "gymnasta", "Cyprus")

    private lateinit var currentWord: String

    init {
        newGame()
    }

    fun newGame() {
        currentWord = words.random()
    }

    fun getChallenge(): String {
        return currentWord
            .replace("y", "?")
            .replace("i", "?")
    }

    fun guess(letter: String): Boolean {
        return letter in currentWord
    }

    fun getCurrentWord(): String {
        return currentWord
    }
}