package br.edu.utfpr.apiserviceiot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leituras")
public class LeituraController {
    @Autowired
    private LeituraService leituraService;

    // outros métodos...
}
