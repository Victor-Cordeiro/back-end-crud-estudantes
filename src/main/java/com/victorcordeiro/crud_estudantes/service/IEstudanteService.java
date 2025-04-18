package com.victorcordeiro.crud_estudantes.service;

import com.victorcordeiro.crud_estudantes.model.Estudante;

import java.util.List;

public interface IEstudanteService {
    Estudante addEstudante(Estudante estudante);

    List<Estudante> getAllEstudantes();

    Estudante updateEstudante(Estudante estudante, Long id);

    void deleteEstudante(Long id);

    Estudante getEstudanteById(Long id);
}
