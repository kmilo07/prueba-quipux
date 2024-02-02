package com.quipux.pruebapractica.domain.exception.validacion;

import com.quipux.pruebapractica.domain.exception.ExcepcionCampoObligatorio;

public class ValidacionDominio {

    public static final String CAMPO_OBLIGATORIO = "El campo %s es obligatorio";
    public static final String MENSAJE_POR_DEFECTO = "Ocurrió un problema al procesar la solicitud.";
    private ValidacionDominio(){}

    public static void campoObligatorio(Object valor, String mensaje){
        if (valor == null || (valor instanceof String && (((String) valor).trim().isEmpty()))){
            throw new ExcepcionCampoObligatorio(mensaje);
        }
    }

    public static String obtenerMensaje(String mensajeBase, Object... valores){
        return String.format(mensajeBase,valores);
    }
}
