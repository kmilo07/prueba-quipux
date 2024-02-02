package com.quipux.pruebapractica.dominio.dto;

import lombok.Data;

import java.util.List;

@Data
public class PeticionListaReproduccionDto {
    private ListaReproduccionDto listaReproduccion;
    private List<CancionDto> canciones;
}
