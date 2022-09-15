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
public class Note {
    Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_note;
}

