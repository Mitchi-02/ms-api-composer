package com.esi.msequipe.Repository;

import com.esi.msequipe.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface EquipeRepository extends JpaRepository<Equipe, Long> {

}
