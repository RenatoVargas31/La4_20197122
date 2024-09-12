package com.app.la4_20197122.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "nutricion")
public class Nutricion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idnutricion", nullable = false)
    private Integer id;

    @Column(name = "idreceta", nullable = false)
    private Integer idreceta;

    @Column(name = "calorias")
    private Double calorias;

    @Column(name = "grasas")
    private Double grasas;

    @Column(name = "`proteínas`")
    private Double proteínas;

    @Column(name = "carbohidratos")
    private Double carbohidratos;

    @Column(name = "fibra")
    private Double fibra;

}