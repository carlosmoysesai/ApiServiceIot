package br.edu.utfpr.apiserviceiot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.utfpr.apiserviceiot.repository.GatewayRepository;

@Service
public class GatewayService {
    @Autowired
    private GatewayRepository gatewayRepository;

    // outros métodos...
}
