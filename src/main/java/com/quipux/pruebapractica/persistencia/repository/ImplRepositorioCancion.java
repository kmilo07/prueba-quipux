package com.quipux.pruebapractica.persistencia.repository;

import com.quipux.pruebapractica.dominio.core.Cancion;
import com.quipux.pruebapractica.dominio.dto.CancionDto;
import com.quipux.pruebapractica.dominio.repositorio.RepositorioCancion;
import com.quipux.pruebapractica.persistencia.crud.CrudCancion;
import com.quipux.pruebapractica.persistencia.entity.CancionEntity;
import com.quipux.pruebapractica.persistencia.mapper.MapperCancion;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class ImplRepositorioCancion implements RepositorioCancion {
    private final CrudCancion crudCancion;
    private final MapperCancion mapperCancion;

    public ImplRepositorioCancion(CrudCancion crudCancion, MapperCancion mapperCancion) {
        this.crudCancion = crudCancion;
        this.mapperCancion = mapperCancion;
    }

    @Override
    public List<CancionDto> obtenerCanciones() {
        return Collections.emptyList();
    }

    @Override
    public Optional<CancionDto> obtenerCancionPorNombreYArtista(String nombre, String artista) {
        return Optional.empty();
    }

    @Override
    public Optional<CancionDto> guardarCancion(Cancion cancion) {
        return Optional.empty();
    }

    @Override
    public List<CancionDto> guardarCanciones(List<Cancion> canciones) {
        return mapperCancion.convertiAListaCancionesDto((List<CancionEntity>) crudCancion.saveAll(mapperCancion.convertirAListaEntity(canciones)));
    }
}
