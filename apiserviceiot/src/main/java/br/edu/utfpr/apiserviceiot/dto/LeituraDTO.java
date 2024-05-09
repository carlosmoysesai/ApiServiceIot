package br.edu.utfpr.apiserviceiot.dto;

public record LeituraDTO(
    Long idSensor, 
    String valor,
    String data
) {}