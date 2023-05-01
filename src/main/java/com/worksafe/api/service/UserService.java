package com.worksafe.api.service;

import com.worksafe.api.model.User;
import com.worksafe.api.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService{
    private UserRepository repository;

    public List<User> buscarTodos(){
        return repository.findAll();
    }

    public User buscarPorId(UUID id){
        return repository.findById(id).orElseThrow(()->new RuntimeException("Usuário não encontrado"));
    }

    public User salvar(User user){
        return repository.save(user);
    }

    public void apagar(UUID id){
        repository.deleteById(id);
    }

    public User atualizar(User user, UUID id){
        if(repository.existsById(id)){
            var update = buscarPorId(id);
            update.setUsername(user.getUsername());
            update.setPassword(user.getPassword());
            return repository.save(update);
        }
        return null;
    }
}
