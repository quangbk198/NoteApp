package com.example.noteapp.presentation.notes.state

import com.example.noteapp.domain.model.Note
import com.example.noteapp.domain.util.NoteOrder
import com.example.noteapp.domain.util.OrderType

/**
 * Created by quangnh
 * Date: 13/7/2022
 * Time: 11:24 PM
 * Project NoteApp
 */
data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
