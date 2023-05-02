package com.worksafe.api.service;

import com.worksafe.api.model.PerfilNr;
import com.worksafe.api.repository.PerfilNrRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class PerfilNrSercive {
    private PerfilNrRepository repository;

    public PerfilNr salvar(PerfilNr perfilNr){
        return repository.save(perfilNr);
    }

    public List<PerfilNr> buscarPorPerfil(UUID perfilNr){
        return  repository.findByPerfil(perfilNr);
    }

    public List<PerfilNr> buscarPorNorma(UUID normaId){
        return repository.findByNorma(normaId);
    }


}
