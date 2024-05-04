package com.esi.msetablissement.controller;


import com.esi.msetablissement.DTO.LaboratoireDTO;
import com.esi.msetablissement.Repository.EtablissementRepository;
import com.esi.msetablissement.Repository.LaboratoireRepository;
import com.esi.msetablissement.entities.Etablissement;
import com.esi.msetablissement.model.ChercheurDTO;
import com.esi.msetablissement.proxy.EquipeProxy;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class Controller {


    @Resource
    private EtablissementRepository etablissementRepository;

    @Resource
    private EquipeProxy equipeProxy;

    @Resource
    private LaboratoireRepository equipeRepository;

    @GetMapping("/etablissements/{id}/directeur")
    public ChercheurDTO show(@PathVariable("id") Long id)
    {
        Optional<Etablissement> e = etablissementRepository.findById(id);
        if(e.isEmpty()) {
            return null;
        }
        return equipeProxy.getDirecteurById(e.get().getDirecteurId()).orElse(null);
    }

    @GetMapping("/laboratoires")
    public List<LaboratoireDTO> indexLaboratoires()
    {
        return equipeRepository.findAll().stream().map(LaboratoireDTO::new).toList();
    }
}
