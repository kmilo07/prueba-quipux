package com.quipux.pruebapractica.dominio.service;

import com.quipux.pruebapractica.dominio.core.ListaReproduccion;
import com.quipux.pruebapractica.dominio.dto.ListaReproduccionDto;
import com.quipux.pruebapractica.dominio.dto.PeticionListaReproduccionDto;
import com.quipux.pruebapractica.dominio.dto.RespuestaListaReproduccionDto;
import com.quipux.pruebapractica.dominio.exception.ExcepcionValorNoEncontrado;
import com.quipux.pruebapractica.dominio.repositorio.RepositorioCancion;
import com.quipux.pruebapractica.dominio.repositorio.RepositorioCancioneEnLista;
import com.quipux.pruebapractica.dominio.repositorio.RepositorioListaReproduccion;
import static com.quipux.pruebapractica.testinformation.PlayListInformation.*;

import static com.quipux.pruebapractica.testinformation.SongInformation.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ServicioListaReproduccionTest {

    @Mock
    RepositorioListaReproduccion repositoryPlayList;

    @Mock
    RepositorioCancion repositorySong;

    @Mock
    RepositorioCancioneEnLista repositorySongInList;

    @InjectMocks
    ServicioListaReproduccion servicio;

    @Test
    void testObtenerListasReproduccionEmpty() {
        when(repositoryPlayList.obtenerListasReproduccion()).thenReturn(Collections.emptyList());
        List<RespuestaListaReproduccionDto> respuesta = servicio.obtenerListasReproduccion();
        assertEquals(Collections.emptyList(),respuesta);

    }

    @Test
    void obtenerListaReproduccionPorNombreNotExist() {
        when(repositoryPlayList.obtenerListaReproduccionPorNombre(anyString())).thenReturn(Optional.empty());
        assertThrows(ExcepcionValorNoEncontrado.class,()->servicio.obtenerListaReproduccionPorNombre(NAME));
    }

    @Test
    void guardarListaReproduccion() {
        PeticionListaReproduccionDto dto = new PeticionListaReproduccionDto(NAME,DESCRIPTION, GOOD_SONG_LIST_DTO);
        ListaReproduccionDto resultReproduccionDto = new ListaReproduccionDto(1,NAME,DESCRIPTION);
        RespuestaListaReproduccionDto result =  new RespuestaListaReproduccionDto();
        result.setNombre(NAME);
        result.setDescripcion(DESCRIPTION);
        result.setCanciones(GOOD_SONG_LIST_DTO);
        when(repositoryPlayList.obtenerListaReproduccionPorNombre(anyString())).thenReturn(Optional.empty());
        when(repositoryPlayList.guardarListaReproduccion(any(ListaReproduccion.class))).thenReturn(resultReproduccionDto);
        when(repositorySong.guardarCanciones(anyList())).thenReturn(dto.getCanciones());

        assertDoesNotThrow(()->servicio.guardarListaReproduccion(dto));
        assertEquals(result, servicio.guardarListaReproduccion(dto));
    }

}