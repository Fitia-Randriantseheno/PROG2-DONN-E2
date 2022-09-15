package com.projet.gestiondenote.controller;

import com.projet.gestiondenote.service.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class TeacherController {
    private TeacherService service;

    @GetMapping
    public List<Teacher> getAllTeachers(@RequestParam int page, @RequestParam int page_size) {
        return service.findAllTeacher(page, page_size).stream().map(mapper::toRest).toList();
    }

    @GetMapping("/types")
    public List<Teacher> filterTeacherByType(@RequestParam Long id) throws Exception {
        return service.filterTeacherByType(id).stream().map(mapper::toRest).toList();
    }

    @PutMapping
    public Teacher updateTeacher(@RequestBody com.projet.gestiondenote.model.put.Teacher toUpdate) throws Exception {
        com.projet.gestiondenote.Teacher teacher = mapper.toDomain(toUpdate);
        return mapper.toRest(service.updateTeacher(teacher));
    }
}
