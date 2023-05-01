package com.worksafe.api.service;

import com.worksafe.api.model.Exame;
import com.worksafe.api.repository.ExameRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ExameService {
    private ExameRepository repository;

    public List<Exame> listarTodos(){
        return repository.findAll();
    }

    public Exame buscarPoId(UUID id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Exame não existe!"));
    }

    public Exame salvar(Exame exame){
        return repository.save(exame);
    }

    public void apagar(UUID id){
        repository.deleteById(id);
    }

    public Exame atualizar(Exame exame, UUID id){
        if(repository.existsById(id)){
            var update = buscarPoId(id);
            update.setNome(exame.getNome());
            update.setDescricao(exame.getDescricao());
            return  repository.save(update);
        }

        return null;
    }

}
