package com.app.la4_20197122.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "ingrediente")
public class Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idingrediente", nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 45)
    private String nombre;

}