package com.hevadevelop.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteKey(
    @PrimaryKey(autoGenerate = true)
    val id: String,
    val prev: String,
    val next: String
)
