package com.worksafe.api.repository;

import com.worksafe.api.model.PerfilNr;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PerfilNrRepository extends JpaRepository<PerfilNr, UUID> {
}