package com.example.crypto.cryptotracker.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class CoinsResponseDto(
    val data: List<CoinDto>
)
