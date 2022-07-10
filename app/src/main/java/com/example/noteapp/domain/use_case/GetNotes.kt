package com.example.noteapp.domain.use_case

import com.example.noteapp.domain.model.Note
import com.example.noteapp.domain.repository.NoteRepository
import com.example.noteapp.domain.util.NoteOrder
import com.example.noteapp.domain.util.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

/**
 * Created by quangnh
 * Date: 10/7/2022
 * Time: 11:42 AM
 * Project NoteApp
 */
class GetNotes(
    private val noteRepository: NoteRepository
) {
    operator fun invoke(
        noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending)
    ): Flow<List<Note>> = flow {
        val listNote = noteRepository.getNotes()

        when (noteOrder.orderType) {
            is OrderType.Ascending -> {
                when (noteOrder) {
                    is NoteOrder.Title -> listNote.sortedBy { it.title.lowercase() }
                    is NoteOrder.Date -> listNote.sortedBy { it.timestamp }
                    is NoteOrder.Color -> listNote.sortedBy { it.color }
                }
            }

            is OrderType.Descending -> {
                when (noteOrder) {
                    is NoteOrder.Title -> listNote.sortedByDescending { it.title.lowercase() }
                    is NoteOrder.Date -> listNote.sortedByDescending { it.timestamp }
                    is NoteOrder.Color -> listNote.sortedByDescending { it.color }
                }
            }
        }

        emit(listNote)
    }
}