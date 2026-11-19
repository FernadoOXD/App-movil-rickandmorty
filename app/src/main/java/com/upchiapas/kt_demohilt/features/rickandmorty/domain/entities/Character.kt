package com.upchiapas.kt_demohilt.features.rickandmorty.domain.entities

data class Character(
    val id: Int,
    val name: String,
    val image: String,
    val species: String? = null
)
