package com.esi.msequipe.DTO;

import lombok.Data;

@Data
public class ChercheurDTO {

    public ChercheurDTO(com.esi.msequipe.entities.Chercheur c) {
        this.id = c.getId();
        this.name = c.getName();
        this.email = c.getEmail();
        this.equipe_name = c.getEquipe().getName();
    }

    private Long id;

    private String name;

    private String email;

    private String equipe_name;
}