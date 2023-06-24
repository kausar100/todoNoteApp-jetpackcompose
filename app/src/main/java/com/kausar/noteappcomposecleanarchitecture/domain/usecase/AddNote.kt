package com.kausar.noteappcomposecleanarchitecture.domain.usecase

import com.kausar.noteappcomposecleanarchitecture.domain.model.InvalidNoteException
import com.kausar.noteappcomposecleanarchitecture.domain.model.Note
import com.kausar.noteappcomposecleanarchitecture.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if(note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNote(note)
    }
}