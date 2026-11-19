package com.upchiapas.kt_demohilt.features.rickandmorty.domain.usescases

import com.upchiapas.kt_demohilt.features.rickandmorty.domain.entities.Character
import com.upchiapas.kt_demohilt.features.rickandmorty.domain.repositories.CharacterRepository
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(
    private val repository: CharacterRepository
) {
    suspend operator fun invoke(): Result<List<Character>> {
        return try {
            val characters = repository.getCharacters()
            if (characters.isEmpty()) {
                Result.failure(Exception("No se encontraron personajes"))
            } else {
                Result.success(characters)
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
