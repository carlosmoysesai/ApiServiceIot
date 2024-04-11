package br.edu.utfpr.apiserviceiot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.utfpr.apiserviceiot.repository.SensorRepository;

@Service
public class SensorService {
    @Autowired
    private SensorRepository sensorRepository;

    // outros métodos...
}
