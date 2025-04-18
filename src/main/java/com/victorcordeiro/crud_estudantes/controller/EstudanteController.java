package com.victorcordeiro.crud_estudantes.controller;


import com.victorcordeiro.crud_estudantes.model.Estudante;
import com.victorcordeiro.crud_estudantes.service.IEstudanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estudantes")
@RequiredArgsConstructor
public class EstudanteController {

    private final IEstudanteService estudanteService;

    // Aqui você pode adicionar os métodos para lidar com as requisições HTTP

    public ResponseEntity<List<Estudante>> getEstudantes() {
        return
    }

}
