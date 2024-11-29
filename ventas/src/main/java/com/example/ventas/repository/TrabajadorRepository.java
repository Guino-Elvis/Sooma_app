package com.example.ventas.repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ventas.entity.Cargo;
import com.example.ventas.entity.Trabajador;
import com.example.ventas.entity.Turno;


public interface TrabajadorRepository extends JpaRepository<Trabajador, Integer> {

  List<Trabajador> findByCargoId(Integer idCargo);
}
