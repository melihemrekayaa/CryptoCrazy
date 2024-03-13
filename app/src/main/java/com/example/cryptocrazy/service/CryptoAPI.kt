package com.example.cryptocrazy.service

import com.example.cryptocrazy.model.Crypto
import com.example.cryptocrazy.model.CryptoList
import retrofit2.http.GET

interface CryptoAPI {

    // https://raw.githubusercontent.com/atilsamancioglu/IA32-CryptoComposeData/main/cryptolist.json

    // BASE_URL  =  https://raw.githubusercontent.com/atilsamancioglu/

    // GET = IA32-CryptoComposeData/main/cryptolist.json

    @GET("IA32-CryptoComposeData/main/cryptolist.json")
    suspend fun getCryptoList() : CryptoList



    // https://raw.githubusercontent.com/atilsamancioglu/IA32-CryptoComposeData/main/crypto.json
    @GET("IA32-CryptoComposeData/main/crypto.json")
    suspend fun getCrypto() : Crypto

}