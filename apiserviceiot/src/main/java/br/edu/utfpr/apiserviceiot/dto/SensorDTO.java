package br.edu.utfpr.apiserviceiot.dto;

public record SensorDTO(
    Long idDevice,
    String nome,
    String tipo
) {}
