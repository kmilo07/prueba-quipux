package com.quipux.pruebapractica.dominio.repositorio;

import com.quipux.pruebapractica.dominio.dto.CancionEnListaDto;

import java.util.List;

public interface RepositorioCancioneEnLista {
    void guardarListaYCanciones(List<CancionEnListaDto> cancionesEnLista);
    List<CancionEnListaDto> obtenerCancionEnLista(Integer id);
    void eliminarListaConIdLista(Integer idLista);

}
