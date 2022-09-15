package com.projet.gestiondenote.controller;

import com.projet.gestiondenote.service.NoteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


    @RestController
    @AllArgsConstructor
    @CrossOrigin("*")
    public class NoteController {
        private NoteService service;

        public List<Note> getAllNotes() {
            return service.findAllNote().toList();
        }

        @GetMapping("/note")
        public List<Note> filterNoteByNote(@RequestParam Long id) throws Exception) {
            return service.filterNoteByStudent(id).stream().toList();
        }
}
