package com.quipux.pruebapractica.dominio.repositorio;

import com.quipux.pruebapractica.dominio.core.ListaReproduccion;
import com.quipux.pruebapractica.dominio.dto.ListaReproduccionDto;
import com.quipux.pruebapractica.dominio.dto.RespuestaListaReproduccionDto;

import java.util.List;

public interface RepositorioListaReproduccion {
    List<RespuestaListaReproduccionDto> obtenerListasReproduccion();
    RespuestaListaReproduccionDto obtenerListaReproduccion(String nombre);
    ListaReproduccionDto guardarListaReproduccion(ListaReproduccion listaReproduccion);
    void eliminarListaReproduccion(String nombre);
}
