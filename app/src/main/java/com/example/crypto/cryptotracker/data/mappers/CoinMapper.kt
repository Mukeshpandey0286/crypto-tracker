package com.example.crypto.cryptotracker.data.mappers

import com.example.crypto.cryptotracker.data.networking.dto.CoinDto
import com.example.crypto.cryptotracker.data.networking.dto.CoinPriceDto
import com.example.crypto.cryptotracker.domain.Coin
import com.example.crypto.cryptotracker.domain.CoinPrice
import java.time.Instant
import java.time.ZoneId


fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        marketCapUsd = marketCapUsd,
        priceUsd = priceUsd,
        changePercent24Hr = changePercent24Hr
    )
}

fun CoinPriceDto.toCoinPrice(): CoinPrice {
    return CoinPrice(
        priceUsd = priceUsd,
        dateTime = Instant
            .ofEpochMilli(time)
            .atZone(ZoneId.of("UTC"))
    )
}