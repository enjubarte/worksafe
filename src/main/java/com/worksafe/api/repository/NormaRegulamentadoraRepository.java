package com.worksafe.api.repository;

import com.worksafe.api.model.NormaRegulamentadora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface NormaRegulamentadoraRepository extends JpaRepository<NormaRegulamentadora, UUID> {
}