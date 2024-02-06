package com.quipux.pruebapractica.dominio.core;

import static com.quipux.pruebapractica.testinformation.PlayListInformation.*;

import com.quipux.pruebapractica.dominio.exception.ExcepcionCampoObligatorio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaReproduccionTest {


    @Test
    void testOfPlayListGoodInformation() {
        assertDoesNotThrow(()->ListaReproduccion.of(NAME, DESCRIPTION));
    }

    @Test
    void testOfPlayListBadInformation() {
        assertThrows(ExcepcionCampoObligatorio.class,()->ListaReproduccion.of(NAME,""));
        assertThrows(ExcepcionCampoObligatorio.class,()->ListaReproduccion.of("",DESCRIPTION));
    }
}