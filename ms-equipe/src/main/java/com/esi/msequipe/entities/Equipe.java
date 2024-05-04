package com.esi.msequipe.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "equipe")
    private List<Chercheur> chercheurs;

    @JsonIgnore
    @OneToOne(mappedBy = "equipe_chef")
    private Chercheur chef;

    //many to one with laboratoire from ms-etablissement
    private Long lobaratoire_id;
}
