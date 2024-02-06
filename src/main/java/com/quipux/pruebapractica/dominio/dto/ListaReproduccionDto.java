package com.quipux.pruebapractica.dominio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListaReproduccionDto {
    private Integer id;
    private String nombre;
    private String descripcion;
}
