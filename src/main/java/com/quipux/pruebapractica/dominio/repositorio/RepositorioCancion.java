package com.quipux.pruebapractica.dominio.repositorio;

import com.quipux.pruebapractica.dominio.core.Cancion;
import com.quipux.pruebapractica.dominio.dto.CancionDto;

import java.util.List;
import java.util.Optional;

public interface RepositorioCancion {
    List<CancionDto> obtenerCanciones();
    Optional<CancionDto> obtenerCancionPorNombreYArtista(String nombre, String artista);
    Optional<CancionDto> guardarCancion(Cancion cancion);
    List<CancionDto> guardarCanciones(List<Cancion> canciones);
}
