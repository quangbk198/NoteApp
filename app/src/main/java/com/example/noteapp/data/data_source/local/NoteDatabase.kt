package com.example.noteapp.data.data_source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.noteapp.data.data_source.local.entity.NoteEntity

/**
 * Created by quangnh
 * Date: 9/7/2022
 * Time: 11:10 PM
 * Project NoteApp
 */

@Database(
    entities = [NoteEntity::class],
    version = 1
)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun getNoteDao(): NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}