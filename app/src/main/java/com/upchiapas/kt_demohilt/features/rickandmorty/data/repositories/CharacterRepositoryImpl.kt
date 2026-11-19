package com.upchiapas.kt_demohilt.features.rickandmorty.data.repositories

import android.util.Log
import com.upchiapas.kt_demohilt.features.rickandmorty.data.datasources.remote.mapper.toDomain
import com.upchiapas.kt_demohilt.features.rickandmorty.data.datasources.remote.api.RickAndMortyApi
import com.upchiapas.kt_demohilt.features.rickandmorty.domain.entities.Character
import com.upchiapas.kt_demohilt.features.rickandmorty.domain.repositories.CharacterRepository
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val api: RickAndMortyApi
) : CharacterRepository {

    override suspend fun getCharacters(): List<Character> {
        val response = api.getCharacters()
        Log.d("RickAndMorty", response.toString())
        return response.results.map { it.toDomain() }
    }
}
