package com.example.mathsquiz2

data class Question(
    val question: String,
    val options: List<String>,
    val correctOption: Int
)