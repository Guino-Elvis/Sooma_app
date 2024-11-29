package com.example.ventas.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ra_social;
    private String marca;
    private String numero;
    private String foto;
}
