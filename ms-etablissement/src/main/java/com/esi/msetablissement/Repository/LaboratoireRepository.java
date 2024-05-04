package com.esi.msetablissement.Repository;

import com.esi.msetablissement.entities.Laboratoire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LaboratoireRepository extends JpaRepository<Laboratoire,Long> {
}
