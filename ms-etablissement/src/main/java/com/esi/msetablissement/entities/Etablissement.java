package com.esi.msetablissement.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Etablissement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private EtablissementType type;

    @JsonIgnore
    @OneToMany(mappedBy = "etablissement")
    private List<Laboratoire> laboratoires;

    //many to one (or one to one) with chercheur from ms-equipe
    private long directeurId;
}
