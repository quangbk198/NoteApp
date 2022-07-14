package com.example.noteapp.domain.use_case

import com.example.noteapp.domain.model.InvalidNoteException
import com.example.noteapp.domain.model.Note
import com.example.noteapp.domain.repository.NoteRepository
import kotlin.jvm.Throws

/**
 * Created by quangnh
 * Date: 14/7/2022
 * Time: 11:43 PM
 * Project NoteApp
 */
class AddNote(
    private val noteRepository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty")
        }

        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty")
        }
        noteRepository.insertNote(note)
    }
}