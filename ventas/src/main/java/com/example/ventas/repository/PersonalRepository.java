package com.example.ventas.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ventas.entity.Cargo;
import com.example.ventas.entity.Personal;


public interface PersonalRepository extends JpaRepository<Personal, Integer> {



}
