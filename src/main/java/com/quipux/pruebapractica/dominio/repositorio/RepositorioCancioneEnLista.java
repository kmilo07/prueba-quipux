package com.quipux.pruebapractica.dominio.repositorio;

import com.quipux.pruebapractica.dominio.dto.CancionDto;
import com.quipux.pruebapractica.dominio.dto.ListaReproduccionDto;

import java.util.List;

public interface RepositorioCancioneEnLista {
    void guardarListaYCanciones(ListaReproduccionDto respuestaLista, List<CancionDto> listaCanciones);
}
