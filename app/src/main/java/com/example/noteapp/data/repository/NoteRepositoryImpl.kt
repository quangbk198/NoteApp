package com.example.noteapp.data.repository

import com.example.noteapp.data.data_source.local.NoteDao
import com.example.noteapp.data.data_source.local.NoteDatabase
import com.example.noteapp.domain.model.Note
import com.example.noteapp.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

/**
 * Created by quangnh
 * Date: 9/7/2022
 * Time: 11:48 PM
 * Project NoteApp
 */
class NoteRepositoryImpl(
    private val noteDatabase: NoteDatabase
) : NoteRepository{

    override fun getNotes(): Flow<List<Note>> {
        return noteDatabase.getNoteDao().getNotes().map { listNoteEntity ->
            listNoteEntity.map { noteEntity ->
                noteEntity.toNote()
            }
        }
    }

    override suspend fun getNoteById(id: Int): Note? {
        return noteDatabase.getNoteDao().getNoteById(id)?.toNote()
    }

    override suspend fun insertNote(note: Note) {
        return noteDatabase.getNoteDao().insertNote(note.toNoteEntity())
    }

    override suspend fun deleteNote(note: Note) {
        return noteDatabase.getNoteDao().deleteNote(note.toNoteEntity())
    }
}