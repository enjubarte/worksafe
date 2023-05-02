package com.worksafe.api.dto;

import java.io.Serializable;
import java.util.UUID;


public record NormaRegulamentadoraDto(
        UUID id,
        String codigo,
        String nome,
        String descricao
)
        implements Serializable {
}