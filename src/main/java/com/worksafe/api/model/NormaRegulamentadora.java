package com.worksafe.api.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
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

    @OneToMany(mappedBy = "norma")
    @ToString.Exclude
    private List<PerfilOcupacional> perfis;
}
