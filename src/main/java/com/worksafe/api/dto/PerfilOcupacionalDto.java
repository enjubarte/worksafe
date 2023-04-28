package com.worksafe.api.dto;

import java.io.Serializable;


public record PerfilOcupacionalDto(
        Long codigo,
        String nome,
        String descricao
) implements Serializable {
}