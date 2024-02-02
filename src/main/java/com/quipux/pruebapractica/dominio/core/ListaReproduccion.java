package com.quipux.pruebapractica.dominio.core;

import com.quipux.pruebapractica.dominio.dto.ListaReproduccionDto;
import static com.quipux.pruebapractica.dominio.exception.validacion.ValidacionDominio.*;

import  static com.quipux.pruebapractica.dominio.enumeracion.NombreCampo.*;

import lombok.Getter;

@Getter
public class ListaReproduccion {
    private Integer id;
    private String nombre;
    private String descripcion;

    private ListaReproduccion(){}
    private ListaReproduccion(ListaReproduccionDto dto){
        this.id = dto.getId();
        this.nombre = dto.getNombre();
        this.descripcion = dto.getDescripcion();
    }

    public void setId(int id){
        this.id = id;
    }

    public ListaReproduccion of(ListaReproduccionDto dto){
        campoObligatorio(dto.getNombre(), obtenerMensaje(CAMPO_OBLIGATORIO, NOMBRE.getNombreCampo()));
        campoObligatorio(dto.getDescripcion(), obtenerMensaje(CAMPO_OBLIGATORIO,DESCRIPCION.getNombreCampo()));
        return new ListaReproduccion(dto);
    }

}
