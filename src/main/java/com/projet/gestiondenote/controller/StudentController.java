package com.projet.gestiondenote.controller;

import com.projet.gestiondenote.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class StudentController {
    private StudentService service;

    public List<Student> getAllStudents() {
        return service.findAllStudent().toList();
    }

    @GetMapping("/{id}")
    public List<Student> filterStudentByType(@RequestParam Long id) throws Exception {
        return service.filterStudentById(id).toList();
    }

    @PutMapping
    public Student updateStudent(@RequestBody com.projet.gestiondenote.model.put.Student toUpdate) throws Exception {
        com.projet.gestiondenote.model.Student student = mapper.toDomain(toUpdate);
        return mapper.toRest(service.updateStudent(student));
}

