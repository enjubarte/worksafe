package com.worksafe.api.controller;

import com.worksafe.api.service.PerfilOcupacionalService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/perfil")
@AllArgsConstructor
public class PerfilOcupacionalController {
    private PerfilOcupacionalService service;

    @GetMapping
    public ResponseEntity<?> listarTodos(){
        return new ResponseEntity<>(service.listarTodos(), HttpStatus.OK);
    }
    @GetMapping("/sub-grupo-princpal/{codigo}")
    public ResponseEntity<?> listarTodosPorSubGrupoPrincipal(@PathVariable Long codigo){
        return new ResponseEntity<>(service.buscarPorSubGrupoPrincipal(codigo), HttpStatus.OK);
    }

    @GetMapping("/ocupacao/{codigo}")
    public ResponseEntity<?> listarTodosPorOcupacao(@PathVariable Long codigo){
        return new ResponseEntity<>(service.buscarPorOcupacao(codigo), HttpStatus.OK);
    }



}
