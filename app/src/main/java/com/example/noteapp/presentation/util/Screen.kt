package com.example.noteapp.presentation.util

/**
 * Created by quangnh
 * Date: 16/7/2022
 * Time: 11:25 PM
 * Project NoteApp
 */
sealed class Screen (val route: String) {
    object NotesScreen: Screen("notes_screen")
    object AddEditNoteScreen: Screen("add_edit_note_screen")
}