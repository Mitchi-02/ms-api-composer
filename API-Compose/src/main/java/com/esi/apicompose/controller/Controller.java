package com.esi.apicompose.controller;


import com.esi.apicompose.Model.Equipe;
import com.esi.apicompose.Model.JoinResult;
import com.esi.apicompose.Model.Laboratoire;
import com.esi.apicompose.proxy.EquipeProxy;
import com.esi.apicompose.proxy.EtablissementProxy;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class Controller {

    @Resource
    private EquipeProxy equipeProxy;

    @Resource
    private EtablissementProxy etablissementProxy;

    @GetMapping("/result")
    public List<JoinResult> index()
    {
        ArrayList<JoinResult> joinResults=new ArrayList<>();
        ArrayList<Equipe>  equipes = new ArrayList<>(equipeProxy.getAllEquipes());
        ArrayList<Laboratoire> labos= new ArrayList<>(etablissementProxy.getAllLaboratoires());
        equipes.forEach(e->{
            labos.forEach(l->{
                if(e.getIdLabo().equals(l.getIdLabo()))
                    joinResults.add(new JoinResult(l.getNom(), e.getNom()));
            });
        });
        return joinResults;
    }
}
