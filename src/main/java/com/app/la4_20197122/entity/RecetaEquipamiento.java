package com.app.la4_20197122.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "receta_equipamiento")
public class RecetaEquipamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreceta_equipamiento", nullable = false)
    private Integer id;

    @Column(name = "idreceta", nullable = false)
    private Integer idreceta;


    @Column(name = "idequipamiento", nullable = false)
    private Integer idequipamiento;

}