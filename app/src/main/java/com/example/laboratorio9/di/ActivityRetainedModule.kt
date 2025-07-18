package com.example.laboratorio9.di

import com.example.laboratorio9.data.repository.NoteRepositoryImpl
import com.example.laboratorio9.domain.repository.NoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

@Module
@InstallIn(ActivityRetainedComponent::class)
abstract class ActivityRetainedModule {
    @Binds
    @ActivityRetainedScoped
    abstract fun bindWeatherRepository(noteRepositoryImpl: NoteRepositoryImpl): NoteRepository
}