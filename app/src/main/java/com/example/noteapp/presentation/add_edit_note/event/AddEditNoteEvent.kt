package com.example.noteapp.presentation.add_edit_note.event

import androidx.compose.ui.focus.FocusState

/**
 * Created by quangnh
 * Date: 16/7/2022
 * Time: 4:48 PM
 * Project NoteApp
 */
sealed class AddEditNoteEvent {
    data class EnteredTitle(val value: String): AddEditNoteEvent()
    data class ChangeTitleFocus(val focusState: FocusState): AddEditNoteEvent()
    data class EnteredContent(val value: String): AddEditNoteEvent()
    data class ChangeContentFocus(val focusState: FocusState): AddEditNoteEvent()
    data class ChangeColor(val color: Int): AddEditNoteEvent()
    object SaveNote: AddEditNoteEvent()
}