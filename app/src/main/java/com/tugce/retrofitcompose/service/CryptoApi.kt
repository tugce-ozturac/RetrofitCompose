package com.tugce.retrofitcompose.service

import androidx.annotation.GuardedBy
import com.tugce.retrofitcompose.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET

interface CryptoApi {
    //atilsamancioglu/K21-JSONDataSet/master/crypto.json
    //BASE -> https://raw.githubusercontent.com/
    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData() : Call<List<CryptoModel>>
}