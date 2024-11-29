
package com.example.ventas.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombreCargo;

}
