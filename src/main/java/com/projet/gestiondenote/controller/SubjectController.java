package com.projet.gestiondenote.controller;

import com.projet.gestiondenote.service.SubjectService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
@AllArgsConstructor
@CrossOrigin("*")
public class SubjectController {
    private SubjectService service;

    public List<Subject> getAllSubjects(@RequestParam int page, @RequestParam int page_size) {
        return service.findAllSubject(page, page_size).stream().map(mapper::toRest).toList();
    }

    @GetMapping("/Subject")
    public List<Subject> filterSubjectByTeacher(@RequestParam Long id) throws Exception {
        return service.filterStudentByTeacher(id).toList();
    }
}
