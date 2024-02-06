package com.quipux.pruebapractica.dominio.core;

import com.quipux.pruebapractica.dominio.exception.ExcepcionCampoObligatorio;
import com.quipux.pruebapractica.testinformation.SongInformation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CancionTest {

    @Test
    void testOfSongGoodInformation() {
        assertDoesNotThrow(()->{Cancion.of(SongInformation.GOOD_INFORMATION);});
    }

    @Test
    void testOfSongBadInformation() {
        assertThrows(ExcepcionCampoObligatorio.class, ()-> Cancion.of(SongInformation.BAD_INFORMATION_TITLE));
        assertThrows(ExcepcionCampoObligatorio.class, ()-> Cancion.of(SongInformation.BAD_INFORMATION_ARTIST));
        assertThrows(ExcepcionCampoObligatorio.class, ()-> Cancion.of(SongInformation.BAD_INFORMATION_ALBUM));
        assertThrows(ExcepcionCampoObligatorio.class, ()-> Cancion.of(SongInformation.BAD_INFORMATION_YEAR));
        assertThrows(ExcepcionCampoObligatorio.class, ()-> Cancion.of(SongInformation.BAD_INFORMATION_GENRE));
    }
}