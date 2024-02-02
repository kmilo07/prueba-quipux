package com.quipux.pruebapractica.domain.enumeracion;

import lombok.Getter;

@Getter
public enum NombreCampo {
    NOMBRE("Nombre");


    private final String nombreCampo;
    NombreCampo(String mensaje){
        this.nombreCampo = mensaje;
    }
}
