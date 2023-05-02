package com.worksafe.api.controller;

import com.worksafe.api.model.NormaRegulamentadora;
import com.worksafe.api.service.NormaRegulamentadoraService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/normas")
@AllArgsConstructor
public class NormasRegulamentadorasController {
    private NormaRegulamentadoraService service;

    @PostMapping
    public NormaRegulamentadora salvar(@RequestBody NormaRegulamentadora norma){
        return service.salvar(norma);
    }
}
