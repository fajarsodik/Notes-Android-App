package com.hevadevelop.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.hevadevelop.domain.model.Note

@Database(entities = [Note::class], exportSchema = false, version = 1)
abstract class NoteDatabase : RoomDatabase() {

    companion object {
        fun getInstance(context: Context): NoteDatabase {
            return Room.databaseBuilder(context, NoteDatabase::class.java, "").build()
        }
    }

    abstract fun getNoteDao(): NoteDao
}