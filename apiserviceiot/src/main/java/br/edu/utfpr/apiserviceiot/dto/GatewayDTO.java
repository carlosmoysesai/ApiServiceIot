package br.edu.utfpr.apiserviceiot.dto;

public record GatewayDTO(
    Long idPerson,
    String nome,
    String descricao,
    String endereco
) {}
