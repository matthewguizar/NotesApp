package com.devmountain.noteAPP.repository;

import com.devmountain.noteAPP.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long>{
}
