package com.example.ventas.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ventas.entity.Cargo;
import com.example.ventas.entity.Personal;
import com.example.ventas.entity.Turno;


public interface PersonalRepository extends JpaRepository<Personal, Integer> {

    List<Personal> findByTurnoId(Integer idTurno);

}
