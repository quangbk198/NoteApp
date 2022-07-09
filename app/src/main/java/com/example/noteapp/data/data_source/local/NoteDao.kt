package com.example.noteapp.data.data_source.local

import androidx.room.*
import com.example.noteapp.data.data_source.local.entity.NoteEntity
import kotlinx.coroutines.flow.Flow

/**
 * Created by quangnh
 * Date: 9/7/2022
 * Time: 11:02 PM
 * Project NoteApp
 */

@Dao
interface NoteDao {

    @Query("SELECT * FROM NoteEntity")
    suspend fun getNotes(): List<NoteEntity>

    @Query("SELECT * FROM NoteEntity WHERE id = :id")
    suspend fun getNoteById(id: Int): NoteEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: NoteEntity)

    @Delete
    suspend fun deleteNote(note: NoteEntity)
}