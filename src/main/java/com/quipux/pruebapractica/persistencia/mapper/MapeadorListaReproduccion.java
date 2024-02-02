package com.quipux.pruebapractica.persistencia.mapper;

import com.quipux.pruebapractica.dominio.core.ListaReproduccion;
import com.quipux.pruebapractica.dominio.dto.ListaReproduccionDto;
import com.quipux.pruebapractica.persistencia.entity.ListaReproduccionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MapeadorListaReproduccion {
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "descripcion", target = "descripcion")
    ListaReproduccionEntity convertirAEntity(ListaReproduccion listaReproduccion);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "descripcion", target = "descripcion")
    ListaReproduccionDto convertirARespuesta(ListaReproduccionEntity entity);
}
