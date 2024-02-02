package com.quipux.pruebapractica.persistencia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "LISTAS_REPRODUCCION")
@Getter
@Setter
@NoArgsConstructor
public class ListaReproduccionEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    private String descripcion;
}
