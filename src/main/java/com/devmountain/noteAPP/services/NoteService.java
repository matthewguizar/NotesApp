package com.devmountain.noteAPP.services;

import com.devmountain.noteAPP.dtos.NoteDto;

import javax.transaction.Transactional;
import java.util.List;

public interface NoteService {
    @Transactional
    void addNote(NoteDto noteDto, Long userId);

    @Transactional
    void deleteNoteById(Long noteId);

    @Transactional
    void updateNoteById(NoteDto noteDto);

    List<NoteDto> getAllNotesByUserId(Long userId);
}
