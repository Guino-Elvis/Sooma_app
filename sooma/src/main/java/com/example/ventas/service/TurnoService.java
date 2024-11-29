package com.example.ventas.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.example.ventas.entity.Turno;

public interface TurnoService {

    public List<Turno> listar();

    public Turno guardar(Turno turno);

    public Turno actualizar(Turno turno);

    public Optional<Turno> listarPorId(Integer id);

    public void eliminarPorId(Integer id);

  
}
