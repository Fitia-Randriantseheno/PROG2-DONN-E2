package com.projet.gestiondenote.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Builder
public class Teacher {
    Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_teacher;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String first_name;

    @Column(nullable = false)
    private String email;
}
