package com.quipux.pruebapractica.dominio.repositorio;

import com.quipux.pruebapractica.dominio.core.GuardarListaReproduccion;
import com.quipux.pruebapractica.dominio.core.ListaReproduccion;
import com.quipux.pruebapractica.dominio.dto.ListaReproduccionDto;
import com.quipux.pruebapractica.dominio.dto.RespuestaListaReproduccionDto;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface RepositorioListaReproduccion {
    List<RespuestaListaReproduccionDto> obtenerListasReproduccion();
    RespuestaListaReproduccionDto obtenerListaReproduccion(String nombre);
    ListaReproduccionDto guardarListaReproduccion(ListaReproduccion listaReproduccion);
    void eliminarListaReproduccion(String nombre);
}
