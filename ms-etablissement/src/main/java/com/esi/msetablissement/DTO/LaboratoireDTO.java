package com.esi.msetablissement.DTO;

import com.esi.msetablissement.entities.Laboratoire;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class LaboratoireDTO {

    public LaboratoireDTO (Laboratoire l) {
        this.nom = l.getName();
        this.idLabo = l.getId();
    }

    private Long idLabo;
    private String nom;
}
