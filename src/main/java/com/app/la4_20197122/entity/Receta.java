package com.app.la4_20197122.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "receta")
public class Receta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreceta", nullable = false)
    private Integer id;

    @JoinColumn(name = "idcategoria", nullable = false)
    private Integer idcategoria;

    @Column(name = "nombre", length = 200)
    private String nombre;

    @Lob
    @Column(name = "instrucciones")
    private String instrucciones;

    @Column(name = "dificultad")
    private Integer dificultad;

    @Column(name = "tiempo_preparacion")
    private LocalTime tiempoPreparacion;

}
