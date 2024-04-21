package com.esi.msetablissement;

import com.esi.msetablissement.Repository.EtablissementRepository;
import com.esi.msetablissement.Repository.LaboratoireRepository;
import com.esi.msetablissement.entities.Etablissement;
import com.esi.msetablissement.entities.Laboratoire;
import jakarta.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class MsEtablissementApplication implements CommandLineRunner {

    @Resource
    EtablissementRepository etablissementRepository;
    @Resource
    LaboratoireRepository laboratoireRepository;

    @Resource
    RepositoryRestConfiguration repositoryRestConfiguration;
    public static void main(String[] args) {
        SpringApplication.run(MsEtablissementApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Laboratoire.class);

        Etablissement e1=new Etablissement();
        Etablissement e2=new Etablissement();
        etablissementRepository.save(e1);
        etablissementRepository.save(e2);

        laboratoireRepository.save(new Laboratoire());
        laboratoireRepository.save(new Laboratoire());
        laboratoireRepository.save(new Laboratoire());
    }
}
