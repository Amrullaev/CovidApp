package com.example.covidapp.models.internet

data class GetCovid(
    val apiSourceCode: String,
    val cache: Cache,
    val dataSource: DataSource,
    val rawData: List<RawData>,
    val summaryStats: SummaryStats
)