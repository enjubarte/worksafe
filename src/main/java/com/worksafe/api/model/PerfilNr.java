package com.worksafe.api.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity(name = "perfil_nr")
@NoArgsConstructor
public class PerfilNr {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "perfil_id")
    private PerfilOcupacional perfil;
    @ManyToOne
    @JoinColumn(name = "norma_id")
    private NormaRegulamentadora norma;
}
