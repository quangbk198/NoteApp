package com.example.noteapp.domain.model

import com.example.noteapp.data.data_source.local.entity.NoteEntity
import com.example.noteapp.ui.theme.*

/**
 * Created by quangnh
 * Date: 9/7/2022
 * Time: 10:39 PM
 * Project NoteApp
 */
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }

    fun toNoteEntity(): NoteEntity {
        return NoteEntity(
            title = title,
            content = content,
            timestamp = timestamp,
            color = color
        )
    }
}
