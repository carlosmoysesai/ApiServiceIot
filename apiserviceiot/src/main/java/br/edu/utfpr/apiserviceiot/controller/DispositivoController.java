package br.edu.utfpr.apiserviceiot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.apiserviceiot.service.DispositivoService;

@RestController
@RequestMapping("/dispositivo")
public class DispositivoController {
    @Autowired
    private DispositivoService dispositivoService;

}
