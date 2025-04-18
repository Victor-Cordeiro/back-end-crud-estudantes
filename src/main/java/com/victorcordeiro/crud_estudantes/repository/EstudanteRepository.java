package com.victorcordeiro.crud_estudantes.repository;

import com.victorcordeiro.crud_estudantes.model.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {
    // Aqui você pode adicionar métodos personalizados, se necessário
    // Por exemplo, encontrar estudantes por nome ou email
    // List<Estudante> findByNome(String nome);
    // List<Estudante> findByEmail(String email);

    Optional<Estudante> findByEmail(String email);



}
