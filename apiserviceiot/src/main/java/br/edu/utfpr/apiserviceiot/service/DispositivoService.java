package br.edu.utfpr.apiserviceiot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.utfpr.apiserviceiot.repository.DispositivoRepository;

@Service
public class DispositivoService {
    @Autowired
    private DispositivoRepository dispositivoRepository;

    // outros métodos...
}
