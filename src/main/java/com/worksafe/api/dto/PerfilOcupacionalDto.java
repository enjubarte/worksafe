package com.worksafe.api.dto;

import com.worksafe.api.model.NormaRegulamentadora;

import java.io.Serializable;


public record PerfilOcupacionalDto(
        Long codigo,
        String nome,
        String descricao,
        NormaRegulamentadora normas
) implements Serializable {
}