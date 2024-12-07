package com.example.crypto.cryptotracker.presentation.coin_list

import com.example.crypto.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}