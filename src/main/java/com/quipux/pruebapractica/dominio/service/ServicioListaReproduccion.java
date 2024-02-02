package com.quipux.pruebapractica.dominio.service;

import com.quipux.pruebapractica.dominio.core.GuardarListaReproduccion;
import com.quipux.pruebapractica.dominio.dto.PeticionListaReproduccionDto;
import com.quipux.pruebapractica.dominio.dto.RespuestaListaReproduccionDto;
import com.quipux.pruebapractica.dominio.repositorio.RepositorioListaReproduccion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioListaReproduccion {
    private final RepositorioListaReproduccion repositorio;


    public ServicioListaReproduccion(RepositorioListaReproduccion repositorio) {
        this.repositorio = repositorio;
    }

    public List<RespuestaListaReproduccionDto> obtenerListasReproduccion(){
        return repositorio.obtenerListasReproduccion();
    }
    public RespuestaListaReproduccionDto obtenerListaReproduccion(String nombre){
        return repositorio.obtenerListaReproduccion(nombre);
    }
    public RespuestaListaReproduccionDto guardarListaReproduccion(PeticionListaReproduccionDto dto){
        GuardarListaReproduccion guardarListaReproduccion = new GuardarListaReproduccion(dto);

        return repositorio.guardarListaReproduccion(guardarListaReproduccion);
    }
    void eliminarListaReproduccion(String nombre){
        repositorio.eliminarListaReproduccion(nombre);
    }

}
