package com.example.noteapp.domain.repository

import com.example.noteapp.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 * Created by quangnh
 * Date: 9/7/2022
 * Time: 11:31 PM
 * Project NoteApp
 */
interface NoteRepository {
    suspend fun getNotes(): List<Note>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}