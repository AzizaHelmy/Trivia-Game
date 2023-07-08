package com.example.triviagame.ui.screens

import com.example.triviagame.ui.util.QuestionState

data class AnswerUiState(
    val id:Int,
    val state: QuestionState,
    val question: String,
    val answer: String,
)
