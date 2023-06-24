package com.kausar.noteappcomposecleanarchitecture.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.kausar.noteappcomposecleanarchitecture.ui.theme.BabyBlue
import com.kausar.noteappcomposecleanarchitecture.ui.theme.LightGreen
import com.kausar.noteappcomposecleanarchitecture.ui.theme.RedOrange
import com.kausar.noteappcomposecleanarchitecture.ui.theme.RedPink
import com.kausar.noteappcomposecleanarchitecture.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)