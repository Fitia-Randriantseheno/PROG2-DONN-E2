package com.projet.gestiondenote.service;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import static org.springframework.data.domain.Sort.Direction.DESC;

public class TeacherService {

    rivate TeacherRepository repository;

    private TypeService typeService;
    public List<Teacher> findAllStudent(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize, Sort.by(DESC, "Date"));
        return repository.findAll(pageable).toList();
    }
}
