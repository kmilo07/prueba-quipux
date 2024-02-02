package com.quipux.pruebapractica.persistencia.repository;

import com.quipux.pruebapractica.dominio.core.GuardarListaReproduccion;
import com.quipux.pruebapractica.dominio.dto.RespuestaListaReproduccionDto;
import com.quipux.pruebapractica.dominio.repositorio.RepositorioListaReproduccion;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ImplRepositorioListaReproduccion implements RepositorioListaReproduccion {
    @Override
    public List<RespuestaListaReproduccionDto> obtenerListasReproduccion() {
        return null;
    }

    @Override
    public RespuestaListaReproduccionDto obtenerListaReproduccion(String nombre) {
        return null;
    }

    @Override
    public RespuestaListaReproduccionDto guardarListaReproduccion(GuardarListaReproduccion guardarListaReproduccion) {
        return null;
    }

    @Override
    public void eliminarListaReproduccion(String nombre) {

    }
}
