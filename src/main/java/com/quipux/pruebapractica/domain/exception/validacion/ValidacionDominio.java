package com.quipux.pruebapractica.domain.exception.validacion;

import com.quipux.pruebapractica.domain.exception.ExcepcionCampoObligatorio;

public class ValidacionDominio {

    private ValidacionDominio(){}

    public static void campoObligatorio(Object valor, String mensaje){
        if (valor == null || (valor instanceof String && (((String) valor).trim().isEmpty()))){
            throw new ExcepcionCampoObligatorio(mensaje);
        }
    }
}
