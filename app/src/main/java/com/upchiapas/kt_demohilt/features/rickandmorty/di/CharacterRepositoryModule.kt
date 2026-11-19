package com.upchiapas.kt_demohilt.features.rickandmorty.di

import com.upchiapas.kt_demohilt.features.rickandmorty.data.repositories.CharacterRepositoryImpl
import com.upchiapas.kt_demohilt.features.rickandmorty.domain.repositories.CharacterRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class CharacterRepositoryModule {
    @Binds
    abstract fun bindCharacterRepository(
        characterRepositoryImpl: CharacterRepositoryImpl
    ): CharacterRepository
}
