package br.edu.utfpr.apiserviceiot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.utfpr.apiserviceiot.repository.AtuadorRepository;

@Service
public class AtuadorService {
    @Autowired
    private AtuadorRepository atuadorRepository;

    // outros métodos...
}
