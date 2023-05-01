package com.worksafe.api.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;


@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity(name = "perfil_ocupacional")
@NoArgsConstructor
public class PerfilOcupacional {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id ;
    private Long grandeGrupo;
    private Long subGrupoPrincipal;
    private Long subGrupo;
    private Long familia;
    private Long codOcupacao;
    private String sglGrandeArea;
    private String nomeGrandeArea;
    private Long codAtividade;
    private String nomeAtividade;
    @ManyToOne
    private NormaRegulamentadora norma;
}
