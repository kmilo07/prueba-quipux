package com.quipux.pruebapractica.dominio.repositorio;

import com.quipux.pruebapractica.dominio.core.ListaReproduccion;
import com.quipux.pruebapractica.dominio.dto.ListaReproduccionDto;

import java.util.List;
import java.util.Optional;

public interface RepositorioListaReproduccion {
    List<ListaReproduccionDto> obtenerListasReproduccion();
    Optional<ListaReproduccionDto> obtenerListaReproduccionPorNombre(String nombre);
    ListaReproduccionDto guardarListaReproduccion(ListaReproduccion listaReproduccion);
    void eliminarListaReproduccionPorId(Integer id);
}
