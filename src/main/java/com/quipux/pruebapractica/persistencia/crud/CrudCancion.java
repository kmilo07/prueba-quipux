package com.quipux.pruebapractica.persistencia.crud;

import com.quipux.pruebapractica.persistencia.entity.CancionEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrudCancion extends CrudRepository<CancionEntity,Integer> {
}
