package com.hevadevelop.data.room

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.hevadevelop.domain.model.Note
import com.hevadevelop.domain.model.NoteKey

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertManyNote(list: List<Note>)

    @Query("SELECT * FROM Note")
    fun getAllNotes(): PagingSource<Int, Note>

    @Query("SELECT * FROM Note WHERE id=:id")
    suspend fun getAllKeys(id: String): NoteKey
}