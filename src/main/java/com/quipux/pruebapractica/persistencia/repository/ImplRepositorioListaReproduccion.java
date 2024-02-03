package com.quipux.pruebapractica.persistencia.repository;

import com.quipux.pruebapractica.dominio.core.ListaReproduccion;
import com.quipux.pruebapractica.dominio.dto.ListaReproduccionDto;
import com.quipux.pruebapractica.dominio.repositorio.RepositorioListaReproduccion;
import com.quipux.pruebapractica.persistencia.crud.CrudListaReproduccion;
import com.quipux.pruebapractica.persistencia.entity.ListaReproduccionEntity;
import com.quipux.pruebapractica.persistencia.mapper.MapeadorListaReproduccion;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ImplRepositorioListaReproduccion implements RepositorioListaReproduccion {

    private final CrudListaReproduccion crudListaReproduccion;
    private final MapeadorListaReproduccion mapeadorListaReproduccion;

    public ImplRepositorioListaReproduccion(CrudListaReproduccion crudListaReproduccion, MapeadorListaReproduccion mapeadorListaReproduccion) {
        this.crudListaReproduccion = crudListaReproduccion;
        this.mapeadorListaReproduccion = mapeadorListaReproduccion;
    }

    @Override
    public List<ListaReproduccionDto> obtenerListasReproduccion() {
        return mapeadorListaReproduccion.convertirAListasReproduccionDto((List<ListaReproduccionEntity>) crudListaReproduccion.findAll()) ;
    }

    @Override
    public Optional<ListaReproduccionDto> obtenerListaReproduccionPorNombre(String nombre) {
        return crudListaReproduccion.findByNombre(nombre).map(mapeadorListaReproduccion::convertirARespuesta);
    }

    @Override
    public ListaReproduccionDto guardarListaReproduccion(ListaReproduccion listaReproduccion) {
        ListaReproduccionEntity entity =mapeadorListaReproduccion.convertirAEntity(listaReproduccion);
        return mapeadorListaReproduccion.convertirARespuesta(crudListaReproduccion.save(entity));
    }

    @Override
    public void eliminarListaReproduccion(String nombre) {

    }
}
