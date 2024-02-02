package com.quipux.pruebapractica.dominio.core;

import com.quipux.pruebapractica.dominio.dto.CancionDto;

import static com.quipux.pruebapractica.dominio.enumeracion.NombreCampo.*;
import static com.quipux.pruebapractica.dominio.exception.validacion.ValidacionDominio.*;

public class Cancion {

    private Integer id;
    private String titulo;
    private String artista;
    private String album;
    private String anno;
    private String genero;

    private Cancion(CancionDto dto){
        this.id = dto.getId();
        this.titulo = dto.getTitulo();
        this.artista = dto.getArtista();
        this.album = dto.getAlbum();
        this.anno = dto.getAnno();
        this.genero = dto.getGenero();
    }

    public static Cancion of(CancionDto dto){
        campoObligatorio(dto.getTitulo(), obtenerMensaje(CAMPO_OBLIGATORIO, TITULO.getNombreCampo()));
        campoObligatorio(dto.getArtista(), obtenerMensaje(CAMPO_OBLIGATORIO,ARTISTA.getNombreCampo()));
        campoObligatorio(dto.getAlbum(), obtenerMensaje(CAMPO_OBLIGATORIO,ALBUM.getNombreCampo()));
        campoObligatorio(dto.getAnno(), obtenerMensaje(CAMPO_OBLIGATORIO,ANNO.getNombreCampo()));
        campoObligatorio(dto.getGenero(), obtenerMensaje(CAMPO_OBLIGATORIO,GENERO.getNombreCampo()));
        return new Cancion(dto);
    }
}
