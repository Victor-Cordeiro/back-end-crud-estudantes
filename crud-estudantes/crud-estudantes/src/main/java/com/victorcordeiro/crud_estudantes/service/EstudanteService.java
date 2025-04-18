package com.victorcordeiro.crud_estudantes.service;

import com.victorcordeiro.crud_estudantes.model.Estudante;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService implements IEstudanteService {
    @Override
    public Estudante addEstudante(Estudante estudante) {
        return null;
    }

    @Override
    public List<Estudante> getAllEstudantes() {
        return List.of();
    }

    @Override
    public Estudante updateEstudante(Estudante estudante, Long id) {
        return null;
    }

    @Override
    public void deleteEstudante(Long id) {

    }

    @Override
    public Estudante getEstudanteById(Long id) {
        return null;
    }
}
