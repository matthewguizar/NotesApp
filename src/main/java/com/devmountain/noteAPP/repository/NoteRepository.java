package com.devmountain.noteAPP.repository;

import com.devmountain.noteAPP.entities.Note;
import com.devmountain.noteAPP.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findAllByUserEquals(User user);
}
