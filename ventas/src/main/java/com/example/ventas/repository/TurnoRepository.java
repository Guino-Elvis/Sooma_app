package com.example.ventas.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ventas.entity.Turno;

import java.util.List;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

public interface TurnoRepository extends JpaRepository<Turno, Integer> {


}
