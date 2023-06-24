package com.kausar.noteappcomposecleanarchitecture.presentation.screens.notes

import com.kausar.noteappcomposecleanarchitecture.domain.model.Note
import com.kausar.noteappcomposecleanarchitecture.domain.util.NoteOrder
import com.kausar.noteappcomposecleanarchitecture.domain.util.OrderType


data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)