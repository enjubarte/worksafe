package com.worksafe.api.controller;

import com.worksafe.api.service.PerfilOcupacionalService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/perfil-ocupacional")
@AllArgsConstructor
public class PerfilOcupacionalController {
    private PerfilOcupacionalService service;

    @GetMapping
    public ResponseEntity<?> listarTodos(){
        return new ResponseEntity<>(service.listarTodos(), HttpStatus.OK);
    }
}
