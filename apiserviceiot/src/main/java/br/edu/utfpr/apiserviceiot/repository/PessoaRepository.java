package br.edu.utfpr.apiserviceiot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.apiserviceiot.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    // métodos personalizados...
}