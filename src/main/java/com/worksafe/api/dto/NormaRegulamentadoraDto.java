package com.worksafe.api.dto;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link com.worksafe.api.model.NormaRegulamentadora} entity
 */
public record NormaRegulamentadoraDto(
        UUID id,
        String codigo,
        String descricao
)
        implements Serializable {
}