package com.example.noteapp.domain.use_case

import com.example.noteapp.domain.model.Note
import com.example.noteapp.domain.repository.NoteRepository

/**
 * Created by quangnh
 * Date: 16/7/2022
 * Time: 4:34 PM
 * Project NoteApp
 */
class GetNote(
    private val noteRepository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return noteRepository.getNoteById(id)
    }
}