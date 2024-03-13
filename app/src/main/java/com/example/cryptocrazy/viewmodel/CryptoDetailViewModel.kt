package com.example.cryptocrazy.viewmodel

import androidx.lifecycle.ViewModel
import com.example.cryptocrazy.model.Crypto
import com.example.cryptocrazy.repository.CryptoRepository
import com.example.cryptocrazy.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CryptoDetailViewModel @Inject constructor(
    private val repository: CryptoRepository
) : ViewModel(){

    suspend fun getCrypto() : Resource<Crypto>{
        return repository.getCrypto()
    }
}