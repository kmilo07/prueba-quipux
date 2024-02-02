package com.quipux.pruebapractica.dominio.repositorio;

import com.quipux.pruebapractica.dominio.core.GuardarListaReproduccion;
import com.quipux.pruebapractica.dominio.dto.RespuestaListaReproduccionDto;

import java.util.List;

public interface RepositorioListaReproduccion {
    List<RespuestaListaReproduccionDto> obtenerListasReproduccion();
    RespuestaListaReproduccionDto obtenerListaReproduccion(String nombre);
    RespuestaListaReproduccionDto guardarListaReproduccion(GuardarListaReproduccion guardarListaReproduccion);
    void EliminarListaReproduccion(String nombre);
}
