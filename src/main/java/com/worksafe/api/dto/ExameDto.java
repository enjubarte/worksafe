package com.worksafe.api.dto;

import java.io.Serializable;
import java.util.UUID;

/**
 * A DTO for the {@link com.worksafe.api.model.Exame} entity
 */
public record ExameDto(UUID id, String nome, String descricao) implements Serializable {
}