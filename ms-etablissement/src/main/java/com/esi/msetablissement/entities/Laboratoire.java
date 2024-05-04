package com.esi.msetablissement.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Laboratoire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String speciality;

    @ManyToOne
    private Etablissement etablissement;

    //many to one to many (or one to one) with chercheur from ms-equipe
    private long directeurId;
}


