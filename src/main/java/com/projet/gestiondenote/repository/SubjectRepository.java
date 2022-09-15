package com.projet.gestiondenote.repository;


import com.projet.gestiondenote.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long>{
    List<Subject> findAllByType(Type type)
}
