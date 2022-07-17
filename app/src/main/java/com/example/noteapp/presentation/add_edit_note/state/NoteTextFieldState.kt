package com.example.noteapp.presentation.add_edit_note.state

/**
 * Created by quangnh
 * Date: 16/7/2022
 * Time: 4:39 PM
 * Project NoteApp
 */
data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)
