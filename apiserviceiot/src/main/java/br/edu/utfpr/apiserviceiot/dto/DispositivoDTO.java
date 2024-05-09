package br.edu.utfpr.apiserviceiot.dto;

public record DispositivoDTO(
    Long idGateway,
    String nome,
    String descricao,
    String localizacao,
    String enderecoIP
) {}