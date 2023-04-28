package com.worksafe.api.repository;

import com.worksafe.api.model.NormaRegulamentadora;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NormaRegulamentadoraRepository extends JpaRepository<NormaRegulamentadora, UUID> {
}