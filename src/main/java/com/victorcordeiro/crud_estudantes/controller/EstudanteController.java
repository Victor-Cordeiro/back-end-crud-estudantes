package com.victorcordeiro.crud_estudantes.controller;


import com.victorcordeiro.crud_estudantes.model.Estudante;
import com.victorcordeiro.crud_estudantes.service.IEstudanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/estudantes")
@RequiredArgsConstructor
public class EstudanteController {

    private final IEstudanteService estudanteService;

    // Aqui você pode adicionar os métodos para lidar com as requisições HTTP

    @GetMapping
    public ResponseEntity<List<Estudante>> getAllEstudantes() {
        return new ResponseEntity<>(estudanteService.getAllEstudantes(), HttpStatus.OK);
    }


    @PostMapping
    public Estudante addEstudante(@RequestBody Estudante estudante) {
        return estudanteService.addEstudante(estudante);
    }


    @PutMapping("/update/{id}")
    public Estudante updateEstudante(@RequestBody Estudante estudante, @PathVariable Long id) {
        return estudanteService.updateEstudante(estudante, id);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteEstudante(@PathVariable Long id) {
        estudanteService.deleteEstudante(id);
    }


    @GetMapping("/estudante/{id}")
    public Estudante getEstudanteById(@PathVariable Long id) {
        return estudanteService.getEstudanteById(id);
    }





}
