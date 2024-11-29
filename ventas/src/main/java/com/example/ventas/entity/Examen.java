package com.example.ventas.entity;


import java.sql.Date;

import org.attoparser.dom.Text;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Examen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private Date fecha;
    private String resultado;
    private Text observaciones;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trabajador_id")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Trabajador trabajador;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personal_id")
    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    private Personal personal;

}
