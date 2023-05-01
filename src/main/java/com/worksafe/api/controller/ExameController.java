package com.worksafe.api.controller;

import com.worksafe.api.model.Exame;
import com.worksafe.api.service.ExameService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exames")
@AllArgsConstructor
public class ExameController {
    private ExameService service;

    @PostMapping
    public List<Exame> salvarAll(@RequestBody List<Exame> exames){
        return service.salvarAll(exames);
    }
}
