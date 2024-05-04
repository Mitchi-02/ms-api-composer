package com.esi.msequipe.DTO;

import com.esi.msequipe.entities.Equipe;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor

public class EquipeDTO {

    public EquipeDTO (Equipe e) {
        this.nom = e.getName();
        this.idLabo = e.getLobaratoire_id();
    }

    private String nom;

    private Long idLabo;
}
