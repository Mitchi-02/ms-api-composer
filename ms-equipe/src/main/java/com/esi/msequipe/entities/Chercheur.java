package com.esi.msequipe.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Chercheur {

    @Id
    private Long id;

    private String name;

    private String email;

    @ManyToOne
    private Equipe equipe;

    @OneToOne
    private Equipe equipe_chef;
}
