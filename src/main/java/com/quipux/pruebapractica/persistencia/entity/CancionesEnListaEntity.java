package com.quipux.pruebapractica.persistencia.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CANCIONES_EN_LISTA")
public class CancionesEnListaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ID_LISTA_REPRODUCCION")
    private Integer idListaReproduccion;

    @Column(name = "ID_CANCION")
    private Integer idCancion;
}
