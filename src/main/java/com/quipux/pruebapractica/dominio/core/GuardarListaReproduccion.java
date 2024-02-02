package com.quipux.pruebapractica.dominio.core;

import com.quipux.pruebapractica.dominio.dto.PeticionListaReproduccionDto;

import java.util.List;
import java.util.stream.Collectors;

public class GuardarListaReproduccion {
    ListaReproduccion listaReproduccion;
    List<Cancion> canciones;

    public GuardarListaReproduccion(PeticionListaReproduccionDto dto){
        this.listaReproduccion = ListaReproduccion.of(dto.getNombre(),dto.getDescripcion());
        this.canciones = dto.getCanciones().stream().map(Cancion::of).collect(Collectors.toList());
    }
}
