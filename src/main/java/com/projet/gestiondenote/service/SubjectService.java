package com.projet.gestiondenote.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import static org.springframework.data.domain.Sort.Direction.DESC;

@Service
@AllArgsConstructor
public class SubjectService {
    private SubjectRepository repository;

    private TypeService typeService;
    public List<Subject> findAllSubject(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize, Sort.by(DESC, "Date"));
        return repository.findAll(pageable).toList();
    }
}
