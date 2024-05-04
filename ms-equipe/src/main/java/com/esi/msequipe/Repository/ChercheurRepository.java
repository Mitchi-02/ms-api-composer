package com.esi.msequipe.Repository;

import com.esi.msequipe.entities.Chercheur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface ChercheurRepository extends JpaRepository<Chercheur, Long> {

}
