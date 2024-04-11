package br.edu.utfpr.apiserviceiot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.utfpr.apiserviceiot.repository.LeituraRepository;

@Service
public class LeituraService {
    @Autowired
    private LeituraRepository leituraRepository;

    // outros métodos...
}