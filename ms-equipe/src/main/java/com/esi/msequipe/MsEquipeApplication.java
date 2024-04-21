package com.esi.msequipe;

import com.esi.msequipe.Repository.ChercheurRepository;
import com.esi.msequipe.Repository.EquipeRepository;
import com.esi.msequipe.entities.Chercheur;
import com.esi.msequipe.entities.Equipe;
import jakarta.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsEquipeApplication implements CommandLineRunner{

    @Resource
    private EquipeRepository equipeRepository;

    @Resource
    private ChercheurRepository chercheurRepository;

    public static void main(String[] args) {
        SpringApplication.run(MsEquipeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Equipe eq1=new Equipe();
        Equipe eq2=new Equipe();

        Equipe eq3=new Equipe();
        Equipe eq4=new Equipe();

        equipeRepository.save(eq1);   equipeRepository.save(eq2);   equipeRepository.save(eq3);
        equipeRepository.save(eq4);

        chercheurRepository.save(new Chercheur());
        chercheurRepository.save(new Chercheur());

        chercheurRepository.save(new Chercheur());
        chercheurRepository.save(new Chercheur());

        chercheurRepository.save(new Chercheur());
        chercheurRepository.save(new Chercheur());

        chercheurRepository.save(new Chercheur());
        chercheurRepository.save(new Chercheur());





    }
}
