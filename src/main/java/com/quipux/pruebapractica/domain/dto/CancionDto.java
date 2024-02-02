package com.quipux.pruebapractica.domain.dto;

import lombok.Data;

@Data
public class CancionDto {
    private Integer id;
    private String titulo;
    private String artista;
    private String album;
    private String anno;
    private String genero;
}
