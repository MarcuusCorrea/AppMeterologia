package com.example.appmeterologia.data.di

import com.example.appmeterologia.data.Repository.WeatherRepository
import com.example.appmeterologia.data.Repository.WeatherRepositoryImpi
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface RepositoryModule {

    @Binds
    fun bindWeatherRepository(repository: WeatherRepositoryImpi): WeatherRepository
}