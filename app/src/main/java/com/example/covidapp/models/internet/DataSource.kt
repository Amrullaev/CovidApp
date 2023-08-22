package com.example.covidapp.models.internet

data class DataSource(
    val lastGithubCommit: String,
    val publishedBy: String,
    val ref: String,
    val url: String
)