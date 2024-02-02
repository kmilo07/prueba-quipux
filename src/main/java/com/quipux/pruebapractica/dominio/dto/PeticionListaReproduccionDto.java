package com.quipux.pruebapractica.dominio.dto;

import lombok.Data;

import java.util.List;

@Data
public class PeticionListaReproduccionDto {
    private String nombre;
    private String descripcion;
    private List<CancionDto> canciones;
}
