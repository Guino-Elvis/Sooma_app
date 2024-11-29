package com.example.ventas.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.ventas.entity.Examen;
import com.example.ventas.entity.Personal;
import com.example.ventas.entity.Trabajador;


public interface ExamenRepository extends JpaRepository<Examen, Integer> {

    List<Personal> findByPersonalId(Integer idPersonal);
    List<Trabajador> findByTrabajadorId(Integer idTrabajador);

}
