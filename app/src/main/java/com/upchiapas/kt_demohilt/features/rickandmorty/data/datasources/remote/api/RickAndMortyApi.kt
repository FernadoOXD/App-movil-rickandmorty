package com.upchiapas.kt_demohilt.features.rickandmorty.data.datasources.remote.api

import com.upchiapas.kt_demohilt.features.rickandmorty.data.datasources.remote.models.CharacterResponseDto
import retrofit2.http.GET

interface RickAndMortyApi {
    @GET("character")
    suspend fun getCharacters(): CharacterResponseDto
}
