package com.example.crypto.cryptotracker.domain

import java.time.ZonedDateTime

data class CoinPrice(
    val priceUsd: Double,
    val dateTime: ZonedDateTime
)