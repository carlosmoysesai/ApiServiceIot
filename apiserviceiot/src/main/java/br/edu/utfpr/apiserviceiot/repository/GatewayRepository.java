package br.edu.utfpr.apiserviceiot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.apiserviceiot.model.Gateway;

public interface GatewayRepository extends JpaRepository<Gateway, Long> {
    // métodos personalizados...
}
