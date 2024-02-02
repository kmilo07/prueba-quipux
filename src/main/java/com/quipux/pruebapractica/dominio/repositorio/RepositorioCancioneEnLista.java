package com.quipux.pruebapractica.dominio.repositorio;

import com.quipux.pruebapractica.dominio.dto.CancionEnListaDto;

import java.util.List;

public interface RepositorioCancioneEnLista {
    void guardarListaYCanciones(List<CancionEnListaDto> cancionesEnLista);
}
