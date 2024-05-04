package com.esi.apicompose.proxy;

import com.esi.apicompose.Model.Equipe;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "ms-equipe")
@LoadBalancerClient(name = "ms-equipe")
public interface EquipeProxy {

    @GetMapping("/api/equipes")
    List<Equipe> getAllEquipes();

}
