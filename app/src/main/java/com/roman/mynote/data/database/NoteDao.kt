package com.roman.mynote.data.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.roman.mynote.data.model.Note

@Dao
interface NoteDao {
    @Query("SELECT * FROM note")
    fun getAllNote(): LiveData<List<Note>>

    @Insert
    suspend fun insertNote(vararg note: Note)

    @Update
    suspend fun updateNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}