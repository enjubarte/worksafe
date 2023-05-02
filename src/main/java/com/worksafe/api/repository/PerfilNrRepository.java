package com.worksafe.api.repository;

import com.worksafe.api.model.PerfilNr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@Repository
public interface PerfilNrRepository extends JpaRepository<PerfilNr, UUID> {

    List<PerfilNr> findByPerfil(UUID id);
    List<PerfilNr> findByNorma(UUID id);

}