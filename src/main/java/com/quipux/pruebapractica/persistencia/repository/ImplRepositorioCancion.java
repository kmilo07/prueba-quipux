package com.quipux.pruebapractica.persistencia.repository;

import com.quipux.pruebapractica.dominio.core.Cancion;
import com.quipux.pruebapractica.dominio.dto.CancionDto;
import com.quipux.pruebapractica.dominio.repositorio.RepositorioCancion;

import java.util.List;
import java.util.Optional;

public class ImplRepositorioCancion implements RepositorioCancion {
    @Override
    public List<CancionDto> obtenerCanciones() {
        return null;
    }

    @Override
    public Optional<CancionDto> obtenerCancionPorNombreYArtista(String nombre, String artista) {
        return Optional.empty();
    }

    @Override
    public Optional<CancionDto> guardarCancion(Cancion cancion) {
        return Optional.empty();
    }

    @Override
    public List<CancionDto> guardarCanciones(List<Cancion> canciones) {
        return null;
    }
}
