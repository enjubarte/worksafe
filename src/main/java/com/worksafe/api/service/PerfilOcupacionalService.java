package com.worksafe.api.service;

import com.worksafe.api.model.PerfilOcupacional;
import com.worksafe.api.repository.PerfilOcupacionalRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
@AllArgsConstructor
public class PerfilOcupacionalService {
    private PerfilOcupacionalRepository repository;


    public Page<PerfilOcupacional> listarTodos(){
        return repository.findAll(Pageable.ofSize(50));
    }

    public PerfilOcupacional buscarPorId(UUID id){
        return repository.findById(id).orElseThrow(()->new RuntimeException("Perfil não existe!"));
    }

    public List<PerfilOcupacional> buscarPorSubGrupoPrincipal(Long codigo){
        return  repository.findBySubGrupoPrincipal(codigo);
    }

    public PerfilOcupacional salvar( PerfilOcupacional perfil){
        return repository.save(perfil);
    }

    public void apagar(UUID id){
        repository.deleteById(id);
    }

}
