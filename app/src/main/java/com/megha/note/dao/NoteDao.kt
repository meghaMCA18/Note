package com.megha.note.dao

import androidx.room.*
import com.megha.note.entity.Note

@Dao
interface NoteDao {

    @Insert
    fun insert(note: Note)

    @Update
    fun update(note: Note)

    @Delete
    fun delete(note: Note)

    @Query("SELECT * FROM notes ORDER BY id DESC")
    fun getAll() : List<Note>

    @Query("SELECT * FROM notes WHERE id = :id")
    fun getById(id: Int) : List<Note>

    @Query("SELECT * FROM notes WHERE title LIKE :search ORDER BY id DESC")
    fun getByTitle(search: String?): List<Note>

    @Query("SELECT * FROM notes WHERE label = :id ORDER BY id DESC")
    fun getByLabel(id: String) : List<Note>
}