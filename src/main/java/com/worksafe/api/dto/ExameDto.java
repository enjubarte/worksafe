package com.worksafe.api.dto;

import java.io.Serializable;
import java.util.UUID;

public record ExameDto(
        UUID id,
        String nome,
        String descricao
) implements Serializable {
}