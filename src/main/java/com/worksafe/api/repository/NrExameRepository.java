package com.worksafe.api.repository;

import com.worksafe.api.model.NrExame;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NrExameRepository extends JpaRepository<NrExame, UUID> {
}