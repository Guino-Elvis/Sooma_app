package com.example.ventas.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

}
