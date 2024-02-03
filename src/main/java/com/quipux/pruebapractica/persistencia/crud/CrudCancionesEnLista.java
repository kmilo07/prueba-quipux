package com.quipux.pruebapractica.persistencia.crud;

import com.quipux.pruebapractica.persistencia.entity.CancionesEnListaEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CrudCancionesEnLista extends CrudRepository<CancionesEnListaEntity, Long> {

    @Query(value = "" +
            "SELECT * FROM CANCIONES_EN_LISTA " +
            "WHERE ID_LISTA_REPRODUCCION = :idLista", nativeQuery = true)
    List<CancionesEnListaEntity> obtenerCancionesEnListaPorIdLista(Integer idLista);

    @Modifying
    @Query(value = "" +
            "DELETE FROM CANCIONES_EN_LISTA " +
            "WHERE ID_LISTA_REPRODUCCION = :idLista", nativeQuery = true)
    void eliminarCancionesEnListaPorIdLista(Integer idLista);

}
