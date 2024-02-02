package com.quipux.pruebapractica.persistencia.mapper;

import com.quipux.pruebapractica.dominio.dto.CancionEnListaDto;
import com.quipux.pruebapractica.persistencia.entity.CancionesEnListaEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MapeadorCancionEnLista {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "idListaReproduccion", target = "idListaReproduccion")
    @Mapping(source = "idCancion", target = "idCancion")
    CancionesEnListaEntity convertirACancionesEnListaEntity(CancionEnListaDto dto);
    List<CancionesEnListaEntity> convertirAListaDeCancioneEntity(List<CancionEnListaDto> listaDtos);

    @InheritInverseConfiguration
    CancionEnListaDto convertirACancionEnListDto(CancionesEnListaEntity entity);
    List<CancionEnListaDto> convertirAListDeCancionesDto(List<CancionesEnListaEntity> entities);

}
