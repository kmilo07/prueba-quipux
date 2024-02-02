package com.quipux.pruebapractica.persistencia.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CANCIONES_EN_LISTA")
@Getter
@Setter
@NoArgsConstructor
public class CancionesEnListaEntity {
    private static final long serialVersionUID = 2L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ID_LISTA_REPRODUCCION")
    private Integer idListaReproduccion;

    @Column(name = "ID_CANCION")
    private Integer idCancion;
}
