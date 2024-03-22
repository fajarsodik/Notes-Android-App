package com.hevadevelop.data.di

import android.content.Context
import com.hevadevelop.data.room.NoteDao
import com.hevadevelop.data.room.NoteDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DataModule {

    @Provides
    fun provideDatabase(@ApplicationContext context: Context): NoteDatabase =
        NoteDatabase.getInstance(context)

    @Provides
    fun provideDAO(noteDatabase: NoteDatabase): NoteDao = noteDatabase.getNoteDao()
}