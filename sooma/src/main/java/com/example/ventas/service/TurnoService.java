package com.example.ventas.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.example.ventas.entity.turno;

public interface turnoService {

    public List<turno> listar();

    public turno guardar(turno turno);

    public turno actualizar(turno turno);

    public Optional<turno> listarPorId(Integer id);

    public void eliminarPorId(Integer id);

    
}
