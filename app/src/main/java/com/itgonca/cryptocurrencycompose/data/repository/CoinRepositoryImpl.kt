package com.itgonca.cryptocurrencycompose.data.repository

import com.itgonca.cryptocurrencycompose.data.remote.CoinApi
import com.itgonca.cryptocurrencycompose.data.remote.dto.CoinDetailDto
import com.itgonca.cryptocurrencycompose.data.remote.dto.CoinDto
import com.itgonca.cryptocurrencycompose.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(private val api: CoinApi) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> = api.getCoins()

    override suspend fun getCoinById(coinId: String): CoinDetailDto = api.getCoinById(coinId)
}