package com.example.ventas.service;


import java.util.List;
import java.util.Optional;

import com.example.ventas.entity.Examen;

public interface ExamenService {

    public List<Examen> listar();

    public Examen guardar(Examen examen);

    public Examen actualizar(Examen examen);

    public Optional<Examen> listarPorId(Integer id);

    public void eliminarPorId(Integer id);


}
