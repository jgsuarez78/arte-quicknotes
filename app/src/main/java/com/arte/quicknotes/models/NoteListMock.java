package com.arte.quicknotes.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by curso on 27/04/2016.
 */
public class NoteListMock {
    private static List<Note> noteList;

    public static List<Note> getList() {
        if (noteList == null) {
            createList();
        }
        return noteList;
    }

    public static void addNote(Note note){
        noteList.add(note);
    }

    private static void createList() {
        noteList = new ArrayList<Note>();
        for (int i=0;i<50;i++){
            Note note = new Note();
            note.setTitle("Note #" + (i+1));
            note.setContent("Nota de prueba Nota de prueba Nota de prueba Nota de prueba Nota de prueba");
            noteList.add(note);
        }
    }
}
