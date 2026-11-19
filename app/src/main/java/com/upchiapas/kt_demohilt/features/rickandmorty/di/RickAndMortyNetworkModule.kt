package com.upchiapas.kt_demohilt.features.rickandmorty.di

import com.upchiapas.kt_demohilt.core.di.RickAndMortyRetrofit
import com.upchiapas.kt_demohilt.features.rickandmorty.data.datasources.remote.api.RickAndMortyApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RickAndMortyNetworkModule {
    @Provides
    @Singleton
    fun provideRickAndMortyApi(@RickAndMortyRetrofit retrofit: Retrofit): RickAndMortyApi {
        return retrofit.create(RickAndMortyApi::class.java)
    }
}
