package com.quipux.pruebapractica.dominio.service;

import com.quipux.pruebapractica.dominio.core.ListaReproduccion;
import com.quipux.pruebapractica.dominio.core.ListaReproduccionParaGuardar;
import com.quipux.pruebapractica.dominio.dto.*;
import com.quipux.pruebapractica.dominio.repositorio.RepositorioCancion;
import com.quipux.pruebapractica.dominio.repositorio.RepositorioCancioneEnLista;
import com.quipux.pruebapractica.dominio.repositorio.RepositorioListaReproduccion;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioListaReproduccion {
    private final RepositorioListaReproduccion repositorioListaReproduccion;
    private final RepositorioCancion repositorioCancion;
    private final RepositorioCancioneEnLista repositorioCancioneEnLista;



    public ServicioListaReproduccion(RepositorioListaReproduccion repositorioListaReproduccion, RepositorioCancion repositorioCancion, RepositorioCancioneEnLista repositorioCancioneEnLista) {
        this.repositorioListaReproduccion = repositorioListaReproduccion;
        this.repositorioCancion = repositorioCancion;
        this.repositorioCancioneEnLista = repositorioCancioneEnLista;
    }

    public List<RespuestaListaReproduccionDto> obtenerListasReproduccion(){
        List<RespuestaListaReproduccionDto> respuesta = new ArrayList<>();
        List<ListaReproduccionDto> listaReproduccionDtos = repositorioListaReproduccion.obtenerListasReproduccion();
        llenarRespuestaDeCancionesPorListas(listaReproduccionDtos, respuesta);
        return respuesta;
    }

    private void llenarRespuestaDeCancionesPorListas(List<ListaReproduccionDto> listaReproduccionDtos, List<RespuestaListaReproduccionDto> respuesta){
        listaReproduccionDtos.forEach(dto -> {
            RespuestaListaReproduccionDto respuesta2 = new RespuestaListaReproduccionDto();
            respuesta2.setNombre(dto.getNombre());
            respuesta2.setDescripcion(dto.getDescripcion());
            respuesta2.setCanciones(obtenerCancionesPorLista(dto.getId()));
            respuesta.add(respuesta2);
        });
    }

    private List<CancionDto> obtenerCancionesPorLista(Integer idLista){
        return repositorioCancion.obtenerCancionesPorIdLista(idLista);
    }
    public RespuestaListaReproduccionDto obtenerListaReproduccion(String nombre){
        return repositorioListaReproduccion.obtenerListaReproduccion(nombre);
    }

    @Transactional
    public RespuestaListaReproduccionDto guardarListaReproduccion(PeticionListaReproduccionDto dto){
        ListaReproduccionParaGuardar listaReproduccionParaGuardar = new ListaReproduccionParaGuardar(dto);
        RespuestaListaReproduccionDto respuesta = new RespuestaListaReproduccionDto();
        ListaReproduccionDto respuestaRepositorioLista = repositorioListaReproduccion.guardarListaReproduccion(listaReproduccionParaGuardar.getListaReproduccion());
        List<CancionDto> respuestaRepositorioCanciones = repositorioCancion.guardarCanciones(listaReproduccionParaGuardar.getCanciones());
        repositorioCancioneEnLista.guardarListaYCanciones(crearCancionesEnLista(respuestaRepositorioLista,respuestaRepositorioCanciones));
        llenarRespuestaConDatosDeListaReproduccion(respuestaRepositorioLista, respuesta);
        llenarRespuestaConDatosDeCanciones(respuestaRepositorioCanciones, respuesta);
        return respuesta;
    }

    private void llenarRespuestaConDatosDeListaReproduccion(ListaReproduccionDto dto, RespuestaListaReproduccionDto respuesta){
        respuesta.setNombre(dto.getNombre());
        respuesta.setDescripcion(dto.getDescripcion());
    }

    private void llenarRespuestaConDatosDeCanciones(List<CancionDto> dto, RespuestaListaReproduccionDto respuesta){
        respuesta.setCanciones(dto);
    }

    private List<CancionEnListaDto> crearCancionesEnLista(ListaReproduccionDto listaReproduccion, List<CancionDto> canciones){
        List<CancionEnListaDto> cancionesEnLista = new ArrayList<>();
        canciones.forEach(cancionDto -> {
            CancionEnListaDto dto = new CancionEnListaDto();
            dto.setIdCancion(cancionDto.getId());
            dto.setIdListaReproduccion(listaReproduccion.getId());
            cancionesEnLista.add(dto);
        });
        return cancionesEnLista;
    }

    private void eliminarListaReproduccion(String nombre){
        repositorioListaReproduccion.eliminarListaReproduccion(nombre);
    }

}
