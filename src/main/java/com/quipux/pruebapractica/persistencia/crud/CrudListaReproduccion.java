package com.quipux.pruebapractica.persistencia.crud;

import com.quipux.pruebapractica.persistencia.entity.ListaReproduccionEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrudListaReproduccion extends CrudRepository<ListaReproduccionEntity,Integer> {
}
