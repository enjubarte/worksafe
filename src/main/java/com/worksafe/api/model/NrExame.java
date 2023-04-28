package com.worksafe.api.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity(name = "perfil_ocupacional")
@NoArgsConstructor
public class NrExame {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "norma_id")
    private NormaRegulamentadora norma;
    @ManyToOne
    @JoinColumn(name = "exame_id")
    private Exame exame;
}
