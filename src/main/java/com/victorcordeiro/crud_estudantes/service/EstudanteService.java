package com.victorcordeiro.crud_estudantes.service;

import com.victorcordeiro.crud_estudantes.exception.EstudanteAlreadyExistsException;
import com.victorcordeiro.crud_estudantes.exception.EstudanteNotFoundException;
import com.victorcordeiro.crud_estudantes.model.Estudante;
import com.victorcordeiro.crud_estudantes.repository.EstudanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstudanteService implements IEstudanteService {
    private final EstudanteRepository estudanteRepository;


    @Override
    public List<Estudante> getAllEstudantes() {
        return estudanteRepository.findAll();
    }




    @Override
    public Estudante addEstudante(Estudante estudante) {
        // Verifica se o estudante já existe com base no email
        if(estudanteAlreadyExists(estudante.getEmail())) {
            throw new EstudanteAlreadyExistsException("Já existe estudante com esse email: " + estudante.getEmail());
        }
        // Se não existir, salva o estudante
        return estudanteRepository.save(estudante);
    }




    @Override
    public Estudante updateEstudante(Estudante estudante, Long id) {
        return estudanteRepository.findById(id)
                .map(st -> {
                    st.setNome(estudante.getNome());
                    st.setSobrenome(estudante.getSobrenome());
                    st.setEmail(estudante.getEmail());
                    st.setCurso(estudante.getCurso());
                    return estudanteRepository.save(st);
                })
                .orElseThrow(() -> new EstudanteAlreadyExistsException("Estudante não encontrado com o id: " + id));
    }

    @Override
    public void deleteEstudante(Long id) {
        if(!estudanteRepository.existsById(id)) {
            throw new EstudanteNotFoundException("Estudante não encontrado com o id: " + id);
        }
        estudanteRepository.deleteById(id);

    }

    @Override
    public Estudante getEstudanteById(Long id) {
        return estudanteRepository.findById(id)
                .orElseThrow(() -> new EstudanteAlreadyExistsException("Estudante não encontrado com o id: " + id));
    }

    private boolean estudanteAlreadyExists(String email) {
        return estudanteRepository.findByEmail(email).isPresent();
    }


}
