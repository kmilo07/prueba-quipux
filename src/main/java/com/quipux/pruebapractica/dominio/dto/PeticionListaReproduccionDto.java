package com.quipux.pruebapractica.dominio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PeticionListaReproduccionDto {
    private String nombre;
    private String descripcion;
    private List<CancionDto> canciones;
}
