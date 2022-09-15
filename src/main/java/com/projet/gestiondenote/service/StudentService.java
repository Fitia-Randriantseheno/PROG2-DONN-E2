package com.projet.gestiondenote.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import static org.springframework.data.domain.Sort.Direction.DESC;

@Service
@AllArgsConstructor
public class StudentService {
    private StudentRepository repository;

    private TypeService typeService;
    public List<Student> findAllStudent(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize, Sort.by(DESC, "Date"));
        return repository.findAll(pageable).toList();
    }
}
