package com.esi.msequipe;

import com.esi.msequipe.Repository.ChercheurRepository;
import com.esi.msequipe.Repository.EquipeRepository;
import com.esi.msequipe.entities.Chercheur;
import com.esi.msequipe.entities.Equipe;
import jakarta.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

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

        Equipe eq1= new Equipe(1L, "Equipe1", null, null, 1L);
        Equipe eq2= new Equipe(2L, "Equipe2", null, null, 2L);

        Equipe eq3= new Equipe(3L, "Equipe3", null, null, 3L);
        Equipe eq4= new Equipe(4L, "Equipe4", null, null, 3L);

        equipeRepository.save(eq1);
        equipeRepository.save(eq2);
        equipeRepository.save(eq3);
        equipeRepository.save(eq4);

        chercheurRepository.save(new Chercheur(1L, "Chercheur11", "cherch11@gmail.com", eq1, eq1));
        chercheurRepository.save(new Chercheur(2L, "Chercheur12", "cherch12@gmail.com", eq1, null));

        chercheurRepository.save(new Chercheur(3L, "Chercheur21", "cherch21@gmail.com", eq2, eq2));
        chercheurRepository.save(new Chercheur(4L, "Chercheur22", "cherch22@gmail.com", eq2, null));

        chercheurRepository.save(new Chercheur(5L, "Chercheur31", "cherch31@gmail.com", eq3, eq3));
        chercheurRepository.save(new Chercheur(6L, "Chercheur32", "cherch32@gmail.com", eq3, null));

        chercheurRepository.save(new Chercheur(7L, "Chercheur41", "cherch41@gmail.com", eq4, eq4));
        chercheurRepository.save(new Chercheur(8L, "Chercheur42", "cherch42@gmail.com", eq4, null));
    }
}
