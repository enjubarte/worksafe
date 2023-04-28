package com.worksafe.api.repository;

import com.worksafe.api.model.Exame;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExameRepository extends JpaRepository<Exame, UUID> {
}