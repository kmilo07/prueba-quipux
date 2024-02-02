package com.quipux.pruebapractica.persistencia.repository;

import com.quipux.pruebapractica.dominio.dto.CancionEnListaDto;
import com.quipux.pruebapractica.dominio.repositorio.RepositorioCancioneEnLista;
import com.quipux.pruebapractica.persistencia.crud.CrudCancionesEnLista;
import com.quipux.pruebapractica.persistencia.mapper.MapeadorCancionEnLista;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ImplRepositorioCancionesEnLista implements RepositorioCancioneEnLista {

    private final CrudCancionesEnLista crudCancionesEnLista;
    private final MapeadorCancionEnLista mapeador;

    public ImplRepositorioCancionesEnLista(CrudCancionesEnLista crudCancionesEnLista, MapeadorCancionEnLista mapeador) {
        this.crudCancionesEnLista = crudCancionesEnLista;
        this.mapeador = mapeador;
    }


    @Override
    public void guardarListaYCanciones(List<CancionEnListaDto> cancionEnLista) {
        crudCancionesEnLista.saveAll(mapeador.convertirAListaDeCancioneEntity(cancionEnLista));
    }
}
