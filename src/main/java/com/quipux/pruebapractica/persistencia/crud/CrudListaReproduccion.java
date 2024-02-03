package com.quipux.pruebapractica.persistencia.crud;

import com.quipux.pruebapractica.persistencia.entity.ListaReproduccionEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CrudListaReproduccion extends CrudRepository<ListaReproduccionEntity,Integer> {
    Optional<ListaReproduccionEntity> findByNombre(String nombre);
}
