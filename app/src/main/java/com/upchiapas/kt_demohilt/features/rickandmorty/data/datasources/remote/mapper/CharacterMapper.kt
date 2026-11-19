package com.upchiapas.kt_demohilt.features.rickandmorty.data.datasources.remote.mapper

import com.upchiapas.kt_demohilt.features.rickandmorty.data.datasources.remote.models.CharacterDto
import com.upchiapas.kt_demohilt.features.rickandmorty.domain.entities.Character

fun CharacterDto.toDomain(): Character {
    return Character(
        id = this.id,
        name = this.name,
        image = this.image,
        species = this.species
    )
}
