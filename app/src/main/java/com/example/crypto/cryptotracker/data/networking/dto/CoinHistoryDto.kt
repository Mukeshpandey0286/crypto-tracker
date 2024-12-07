package com.example.crypto.cryptotracker.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class CoinHistoryDto(
    val data: List<CoinPriceDto>
)