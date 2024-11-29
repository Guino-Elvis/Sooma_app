package com.example.ventas.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.ventas.entity.Examen;
import com.example.ventas.entity.Personal;
import com.example.ventas.entity.Trabajador;


public interface ExamenRepository extends JpaRepository<Examen, Integer> {

     // Buscar exámenes por el ID de Personal asociado
     List<Examen> findByPersonalId(Integer idPersonal);

     // Buscar exámenes por el ID de Trabajador asociado
     List<Examen> findByTrabajadorId(Integer idTrabajador);

}


