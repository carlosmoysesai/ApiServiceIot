package br.edu.utfpr.apiserviceiot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.apiserviceiot.model.Atuador;

public interface AtuadorRepository extends JpaRepository<Atuador, Long> {
    // métodos personalizados...
}
