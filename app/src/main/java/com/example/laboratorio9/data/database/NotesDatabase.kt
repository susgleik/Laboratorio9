package com.example.laboratorio9.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.laboratorio9.data.dao.NoteDao
import com.example.laboratorio9.domain.model.Note

@Database(entities = [Note::class], version = 3)
abstract class NotesDatabase: RoomDatabase() {
    abstract val dao: NoteDao
}