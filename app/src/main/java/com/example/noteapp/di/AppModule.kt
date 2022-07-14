package com.example.noteapp.di

import android.app.Application
import androidx.room.Room
import com.example.noteapp.data.data_source.local.NoteDatabase
import com.example.noteapp.data.repository.NoteRepositoryImpl
import com.example.noteapp.domain.repository.NoteRepository
import com.example.noteapp.domain.use_case.AddNote
import com.example.noteapp.domain.use_case.DeleteNote
import com.example.noteapp.domain.use_case.GetNotes
import com.example.noteapp.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by quangnh
 * Date: 13/7/2022
 * Time: 11:04 PM
 * Project NoteApp
 */

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(noteRepository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(noteRepository),
            deleteNote = DeleteNote(noteRepository),
            addNote = AddNote(noteRepository)
        )
    }
}