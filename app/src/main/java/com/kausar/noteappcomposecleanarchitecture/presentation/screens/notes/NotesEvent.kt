package com.kausar.noteappcomposecleanarchitecture.presentation.screens.notes

import com.kausar.noteappcomposecleanarchitecture.domain.model.Note
import com.kausar.noteappcomposecleanarchitecture.domain.util.NoteOrder


sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}