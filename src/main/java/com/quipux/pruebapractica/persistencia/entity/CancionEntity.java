package com.quipux.pruebapractica.persistencia.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CANCIONES")
public class CancionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String artista;
    private String album;
    private String anno;
    private String genero;
}
