package com.quipux.pruebapractica.persistencia.mapper;

import com.quipux.pruebapractica.dominio.core.Cancion;
import com.quipux.pruebapractica.dominio.dto.CancionDto;
import com.quipux.pruebapractica.persistencia.entity.CancionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MapperCancion {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "titulo", target = "titulo")
    @Mapping(source = "artista", target = "artista")
    @Mapping(source = "anno", target = "anno")
    @Mapping(source = "genero", target = "genero")
    CancionEntity convertirAEntity(Cancion cancion);
    List<CancionEntity> convertirAListaEntity(List<Cancion> listaCanciones);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "titulo", target = "titulo")
    @Mapping(source = "artista", target = "artista")
    @Mapping(source = "anno", target = "anno")
    @Mapping(source = "genero", target = "genero")
    CancionDto convertirACancionDto(CancionEntity cancionEntity);
    List<CancionDto> convertiAListaCancionesDto(List<CancionEntity> cancionEntityList);
}