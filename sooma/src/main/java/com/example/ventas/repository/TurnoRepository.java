package com.example.ventas.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ventas.entity.turno;

import java.util.List;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

public interface turnoRepository extends JpaRepository<turno, Integer> {

  
}
