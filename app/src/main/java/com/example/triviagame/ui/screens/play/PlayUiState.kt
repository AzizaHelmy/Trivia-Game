package com.example.triviagame.ui.screens.play

import com.example.triviagame.data.entity.QuestionEntity
import com.example.triviagame.ui.util.NUMBER_OF_QUESTIONS

data class PlayUiState(
    val question: QuestionUiState = QuestionUiState(),
    val numberOfQuestions: Int = NUMBER_OF_QUESTIONS,
    val currentQuestionIndex: Int = -1,
    val userScore: Int = 0,
    var timer: Long = 0L,
    val isLoading: Boolean = false,
    val isError: Boolean = false,
)

data class QuestionUiState(
    val questionText: String = "",
    val answers: List<String> = emptyList(),
    val correctAnswer: String = "",
    val incorrectAnswers: List<String> = emptyList(),
    val selectedAnswer: String = "",
    val enabled: Boolean = true,
)

fun QuestionEntity.toQuestionUiState() =
    QuestionUiState(
        questionText = questionText,
        answers = answers,
        incorrectAnswers = incorrectAnswers,
        correctAnswer = correctAnswer
    )

