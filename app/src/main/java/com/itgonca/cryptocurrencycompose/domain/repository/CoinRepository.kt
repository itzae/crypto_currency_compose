package com.itgonca.cryptocurrencycompose.domain.repository

import com.itgonca.cryptocurrencycompose.data.remote.dto.CoinDetailDto
import com.itgonca.cryptocurrencycompose.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId:String): CoinDetailDto
}