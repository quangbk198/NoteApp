package com.example.noteapp.data.data_source.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.noteapp.domain.model.Note

/**
 * Created by quangnh
 * Date: 9/7/2022
 * Time: 10:28 PM
 * Project NoteApp
 */

@Entity
data class NoteEntity(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    fun toNote(): Note {
        return Note(
            title = title,
            content = content,
            timestamp = timestamp,
            color = color,
            id = id
        )
    }
}
