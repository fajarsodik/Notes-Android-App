package com.hevadevelop.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: String,
    val notesDescription: String,
    val notesTitle: String
)
