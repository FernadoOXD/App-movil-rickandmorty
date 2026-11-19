package com.upchiapas.kt_demohilt.features.rickandmorty.presentation.screens

import com.upchiapas.kt_demohilt.features.rickandmorty.domain.entities.Character

data class CharactersUIState(
    val isLoading: Boolean = false,
    val characters: List<Character> = emptyList(),
    val error: String? = null
)
