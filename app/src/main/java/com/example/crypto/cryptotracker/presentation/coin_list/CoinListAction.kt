package com.example.crypto.cryptotracker.presentation.coin_list

import com.example.crypto.cryptotracker.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi): CoinListAction
}