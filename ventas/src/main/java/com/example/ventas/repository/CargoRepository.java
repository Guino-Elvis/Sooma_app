package com.example.ventas.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ventas.entity.Cargo;


public interface CargoRepository extends JpaRepository<Cargo, Integer> {


}
