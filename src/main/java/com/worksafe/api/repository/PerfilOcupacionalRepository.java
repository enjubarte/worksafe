package com.worksafe.api.repository;

import com.worksafe.api.model.NormaRegulamentadora;
import com.worksafe.api.model.PerfilNr;
import com.worksafe.api.model.PerfilOcupacional;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository

public interface PerfilOcupacionalRepository extends JpaRepository<PerfilOcupacional, UUID> {
    List<PerfilOcupacional> findBySubGrupoPrincipal(Long codigo);
    List<PerfilOcupacional> findByCodOcupacao(Long codigo);
    List<PerfilOcupacional> findByFamilia(Long codigo);

    List<PerfilNr> findByPerfilNrs();
}