package com.quipux.pruebapractica.dominio.core;

import static com.quipux.pruebapractica.dominio.exception.validacion.ValidacionDominio.*;

import  static com.quipux.pruebapractica.dominio.enumeracion.NombreCampo.*;

import lombok.Getter;

@Getter
public class ListaReproduccion {
    private String nombre;
    private String descripcion;

    private ListaReproduccion(){}
    private ListaReproduccion(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public static ListaReproduccion of(String nombre, String descripcion){
        campoObligatorio(nombre, obtenerMensaje(CAMPO_OBLIGATORIO, NOMBRE.getNombreCampo()));
        campoObligatorio(descripcion, obtenerMensaje(CAMPO_OBLIGATORIO,DESCRIPCION.getNombreCampo()));
        return new ListaReproduccion(nombre,descripcion);
    }

}
