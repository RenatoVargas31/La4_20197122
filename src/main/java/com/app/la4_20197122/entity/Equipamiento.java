package com.app.la4_20197122.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "equipamiento")
public class Equipamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idequipamiento", nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 100)
    private String nombre;

}