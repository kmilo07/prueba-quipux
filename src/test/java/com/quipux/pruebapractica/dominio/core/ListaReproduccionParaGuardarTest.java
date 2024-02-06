package com.quipux.pruebapractica.dominio.core;

import com.quipux.pruebapractica.dominio.dto.PeticionListaReproduccionDto;
import static com.quipux.pruebapractica.testinformation.PlayListInformation.*;

import static com.quipux.pruebapractica.testinformation.SongInformation.*;

import com.quipux.pruebapractica.dominio.exception.ExcepcionCampoObligatorio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaReproduccionParaGuardarTest {

    @Test
    void testConstructorListaReproduccionParaGuardar() {
        PeticionListaReproduccionDto dto = new PeticionListaReproduccionDto(NAME,DESCRIPTION, GOOD_SONG_LIST_DTO);
        assertDoesNotThrow(()-> new ListaReproduccionParaGuardar(dto));
    }

    @Test
    void testConstructorListaReproduccionValorMaloEnListaDeCanciones() {
        PeticionListaReproduccionDto dto = new PeticionListaReproduccionDto(NAME,DESCRIPTION,BAD_SONG_LIST_DTO);
        assertThrows( ExcepcionCampoObligatorio.class, () -> new ListaReproduccionParaGuardar(dto));
    }

    @Test
    void testConstructorListaReproduccionValorMaloEnNombreDeLista() {
        PeticionListaReproduccionDto dto = new PeticionListaReproduccionDto("",DESCRIPTION,BAD_SONG_LIST_DTO);
        assertThrows(ExcepcionCampoObligatorio.class,()->new ListaReproduccionParaGuardar(dto));
    }
}