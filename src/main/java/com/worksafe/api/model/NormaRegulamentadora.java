package com.worksafe.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;
@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity(name = "norma_regulamentadora")
@NoArgsConstructor
public class NormaRegulamentadora {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String codigo;
    private String descricao;
}
