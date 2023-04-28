package com.worksafe.api.dto;

import com.worksafe.api.dto.NormaRegulamentadoraDto;
import com.worksafe.api.model.PerfilNr;
import com.worksafe.api.model.PerfilOcupacional;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link PerfilNr} entity
 */
public record PerfilNrDto(UUID id, PerfilOcupacional perfilOcupacional,
                          NormaRegulamentadoraDto norma) implements Serializable {
}