package com.app.la4_20197122.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "receta_ingrediente")
public class RecetaIngrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_receta_ingrediente", nullable = false)
    private Integer id;

    @Column(name = "idreceta", nullable = false)
    private Integer idreceta;

    @Column(name = "idingrediente", nullable = false)
    private Integer idingrediente;

    @Column(name = "idunidad_medida", nullable = false)
    private Integer idunidadMedida;

    @Column(name = "cantidad")
    private Double cantidad;

}