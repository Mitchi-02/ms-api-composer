package com.esi.msetablissement.proxy;

import com.esi.msetablissement.model.ChercheurDTO;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "ms-equipe")
@LoadBalancerClient(name = "ms-equipe")
public interface EquipeProxy {

    @GetMapping("/api/chercheurs/{id}")
    Optional<ChercheurDTO> getDirecteurById(@PathVariable("id") Long id);
}
