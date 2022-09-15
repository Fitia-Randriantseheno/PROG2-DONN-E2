package com.projet.gestiondenote.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<NOte, Long> {
    List<Note> findAllByType(Type type);
}