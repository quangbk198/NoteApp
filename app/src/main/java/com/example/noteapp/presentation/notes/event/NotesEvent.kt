package com.example.noteapp.presentation.notes.event

import com.example.noteapp.domain.model.Note
import com.example.noteapp.domain.util.NoteOrder

/**
 * Created by quangnh
 * Date: 13/7/2022
 * Time: 11:37 PM
 * Project NoteApp
 */
sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}