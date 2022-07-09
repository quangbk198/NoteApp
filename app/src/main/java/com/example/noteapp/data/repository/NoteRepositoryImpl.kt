package com.example.noteapp.data.repository

import com.example.noteapp.data.data_source.local.NoteDao
import com.example.noteapp.data.data_source.local.NoteDatabase
import com.example.noteapp.domain.model.Note
import com.example.noteapp.domain.repository.NoteRepository

/**
 * Created by quangnh
 * Date: 9/7/2022
 * Time: 11:48 PM
 * Project NoteApp
 */
class NoteRepositoryImpl(
    private val noteDatabase: NoteDatabase
) : NoteRepository{

    override suspend fun getNotes(): List<Note> {
        return noteDatabase.getNoteDao().getNotes().map { it.toNote() }
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