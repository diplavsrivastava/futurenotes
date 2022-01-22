package com.springboot.futurenotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.futurenotes.model.Notes;

public interface NotesRepository extends JpaRepository<Notes, Long>{

}
