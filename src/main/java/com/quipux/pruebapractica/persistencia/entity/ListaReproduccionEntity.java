package com.quipux.pruebapractica.persistencia.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "LISTAS_REPRODUCCION")
public class ListaReproduccionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    private String descripcion;
}
