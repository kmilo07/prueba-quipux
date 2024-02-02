package com.quipux.pruebapractica.persistencia.crud;

import com.quipux.pruebapractica.persistencia.entity.CancionesEnListaEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrudCancionesEnLista extends CrudRepository<CancionesEnListaEntity, Long> {
}
