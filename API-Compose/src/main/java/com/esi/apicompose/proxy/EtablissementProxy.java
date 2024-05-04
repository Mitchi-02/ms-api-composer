package com.esi.apicompose.proxy;

import com.esi.apicompose.Model.Equipe;
import com.esi.apicompose.Model.Laboratoire;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "ms-etablissement")
@LoadBalancerClient(name = "ms-etablissement")
public interface EtablissementProxy {

    @GetMapping("/api/laboratoires")
    List<Laboratoire> getAllLaboratoires();

}
