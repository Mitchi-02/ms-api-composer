package com.esi.msequipe.controller;


import com.esi.msequipe.DTO.ChercheurDTO;
import com.esi.msequipe.DTO.EquipeDTO;
import com.esi.msequipe.Repository.ChercheurRepository;
import com.esi.msequipe.Repository.EquipeRepository;
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
    private ChercheurRepository chercheurRepository;

    @Resource
    private EquipeRepository equipeRepository;

    @GetMapping("/chercheurs/{id}")
    public ChercheurDTO show(@PathVariable("id") Long id)
    {
        Optional<com.esi.msequipe.entities.Chercheur> c = chercheurRepository.findById(id);

        if(c.isEmpty()) {
            return null;
        }
        return new ChercheurDTO(c.get());
    }

    @GetMapping("/equipes")
    public List<EquipeDTO> indexEquipes()
    {
        return equipeRepository.findAll().stream().map(EquipeDTO::new).toList();
    }
}
