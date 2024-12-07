package com.example.crypto.di

import com.example.crypto.core.data.networking.HttpClientFactory
import com.example.crypto.cryptotracker.data.networking.RemoteCoinDataSource
import com.example.crypto.cryptotracker.domain.CoinDataSource
import com.example.crypto.cryptotracker.presentation.coin_list.CoinListViewModel
import io.ktor.client.engine.cio.CIO
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
    singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()

    viewModelOf(::CoinListViewModel)
}