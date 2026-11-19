package com.upchiapas.kt_demohilt.features.rickandmorty.data.datasources.remote.models

data class CharacterDto(
    val id: Int,
    val name: String,
    val image: String,
    val species: String? = null
)
