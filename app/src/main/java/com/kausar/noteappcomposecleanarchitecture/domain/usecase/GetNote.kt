package com.kausar.noteappcomposecleanarchitecture.domain.usecase

import com.kausar.noteappcomposecleanarchitecture.domain.model.Note
import com.kausar.noteappcomposecleanarchitecture.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}