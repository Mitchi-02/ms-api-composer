package com.esi.msetablissement.Repository;

import com.esi.msetablissement.entities.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface EtablissementRepository extends JpaRepository<Etablissement,Long> {

}
