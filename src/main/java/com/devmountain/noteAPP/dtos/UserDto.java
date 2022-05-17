package com.devmountain.noteAPP.dtos;

import com.devmountain.noteAPP.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String username;
    private String password;
    Set<NoteDto> noteDtoSet = new HashSet<>();

    public UserDto (User user){
        if (user.getId() != null){
            this.id = user.getId();
        }
        if (user.getUsername() !=null){
            this.username = user.getUsername();
        }
        if (user.getPassword() != null){
            this.password = user.getPassword();
        }
    }
}
