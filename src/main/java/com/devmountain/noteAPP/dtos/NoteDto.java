package com.devmountain.noteAPP.dtos;


import com.devmountain.noteAPP.entities.Note;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoteDto {
    private Long id;
    private String body;
    private UserDto user;

    public NoteDto(Note note){
        if (note.getId() != null){
            this.id = note.getId();
        }
        if (note.getBody() != null){
            this.body = note.getBody();
        }
    }
}
