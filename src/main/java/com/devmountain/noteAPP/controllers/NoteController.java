package com.devmountain.noteAPP.controllers;

import com.devmountain.noteAPP.dtos.NoteDto;
import com.devmountain.noteAPP.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/notes")
public class NoteController {
    @Autowired
    private NoteService noteService;
    //get all notes by user
    @GetMapping("/user/{userId}")
    public List<NoteDto> getNotesByUser(@PathVariable Long userId){
        return noteService.getAllNotesByUserId(userId);
    }
    //add a new note
    @PostMapping("/user/{userId}")
    public void addNote(@RequestBody NoteDto noteDto, @PathVariable Long userId){
        noteService.addNote(noteDto, userId);
    }
    @DeleteMapping("/{noteId}")
    public void deleteByNoteId(@PathVariable Long noteId){
        noteService.deleteNoteById(noteId);
    }
    @PutMapping
    public void updateNote(@RequestBody NoteDto noteDto) {
        noteService.updateNoteById(noteDto);
    }
    @GetMapping("/{noteId}")
    public Optional<NoteDto> getNoteById(@PathVariable Long noteId){
        return noteService.getNoteById(noteId);
    }

}
