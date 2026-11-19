package com.upchiapas.kt_demohilt.features.rickandmorty.domain.repositories

import com.upchiapas.kt_demohilt.features.rickandmorty.domain.entities.Character

interface CharacterRepository {
    suspend fun getCharacters(): List<Character>
}
