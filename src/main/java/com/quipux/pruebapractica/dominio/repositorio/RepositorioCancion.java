package com.quipux.pruebapractica.dominio.repositorio;

import com.quipux.pruebapractica.dominio.core.Cancion;
import com.quipux.pruebapractica.dominio.dto.CancionDto;

import java.util.List;

public interface RepositorioCancion {
    List<CancionDto> obtenerCancionesPorIdLista(Integer idLista);
    List<CancionDto> guardarCanciones(List<Cancion> canciones);

    void eliminarCancionPorId(Integer id);
}
