package com.quipux.pruebapractica.domain.enumeracion;

import lombok.Getter;

@Getter
public enum NombreCampo {
    NOMBRE("nombre"),
    DESCRIPCION("descripcion"),
    TITULO("titulo"),
    ARTISTA("artista"),
    ALBUM("album"),
    ANNO("año"),
    GENERO("genero");

    private final String nombreCampo;
    NombreCampo(String mensaje){
        this.nombreCampo = mensaje;
    }
}
