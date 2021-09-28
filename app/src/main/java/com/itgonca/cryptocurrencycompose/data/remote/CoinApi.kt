package com.itgonca.cryptocurrencycompose.data.remote

import com.itgonca.cryptocurrencycompose.data.remote.dto.CoinDetailDto
import com.itgonca.cryptocurrencycompose.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinApi {
    @GET("/v1/coins")
    fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coindId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}