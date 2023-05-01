package com.worksafe.api.repository;

import com.worksafe.api.model.Exame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ExameRepository extends JpaRepository<Exame, UUID> {
}