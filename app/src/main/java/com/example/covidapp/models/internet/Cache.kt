package com.example.covidapp.models.internet

data class Cache(
    val expires: String,
    val expiresTimestamp: Long,
    val lastUpdated: String,
    val lastUpdatedTimestamp: Long
)