package com.worksafe.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.List;


@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity(name = "perfil_ocupacional")
@NoArgsConstructor
public class PerfilOcupacional {
    @Id
    private Long codigo;
    private String nome;
    private String descricao;

}
