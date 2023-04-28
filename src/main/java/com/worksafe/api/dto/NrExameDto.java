package com.worksafe.api.dto;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link com.worksafe.api.model.NrExame} entity
 */
public record NrExameDto(
        UUID id,
        UUID normaId,
        String normaCodigo,
        String normaDescricao,
        ExameDto1 exame) implements Serializable {
    public record ExameDto1(
            UUID id,
            String nome,
            String descricao)
            implements Serializable {
    }
}