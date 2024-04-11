package br.edu.utfpr.apiserviceiot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.apiserviceiot.model.Sensor;

public interface SensorRepository extends JpaRepository<Sensor, Long> {
    // métodos personalizados...
}
