package com.worksafe.api.service;

import com.worksafe.api.model.NormaRegulamentadora;
import com.worksafe.api.repository.NormaRegulamentadoraRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class NormaRegulamentadoraService {
    private NormaRegulamentadoraRepository repository;

    public List<NormaRegulamentadora> listarTodos(){
        return repository.findAll();
    }

    public NormaRegulamentadora buscarPorId(UUID id){
        return repository.findById(id).orElseThrow(()->new RuntimeException("Norma não encontrada!"));
    }

    public NormaRegulamentadora salvar(NormaRegulamentadora norma){
        return repository.save(norma);
    }

    public void apagar(UUID id){
        repository.deleteById(id);
    }

    public NormaRegulamentadora atualizar(NormaRegulamentadora norma, UUID id){
        if(repository.existsById(id)){
            var update = buscarPorId(id);
            update.setCodigo(norma.getCodigo());
            update.setDescricao(norma.getDescricao());
            update.setPerfis(norma.getPerfis());
            update.setPerfis(norma.getPerfis());
        }
        return null;
    }
}
