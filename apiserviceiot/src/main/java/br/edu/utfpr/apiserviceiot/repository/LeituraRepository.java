package br.edu.utfpr.apiserviceiot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.apiserviceiot.model.Leitura;

public interface LeituraRepository extends JpaRepository<Leitura, Long> {
    // métodos personalizados...
}
