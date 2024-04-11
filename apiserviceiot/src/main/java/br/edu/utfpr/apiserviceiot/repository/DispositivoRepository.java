package br.edu.utfpr.apiserviceiot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.apiserviceiot.model.Dispositivo;

public interface DispositivoRepository extends JpaRepository<Dispositivo, Long> {
    // métodos personalizados...
}
