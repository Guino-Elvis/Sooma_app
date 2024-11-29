package com.example.ventas.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ventas.entity.Turno;
import com.example.ventas.repository.TurnoRepository;
import com.example.ventas.service.TurnoService;


@Service
public class TurnoServiceImpl implements TurnoService{
    
    @Autowired
    private TurnoRepository turnoRepository;

    @Override
    public List<Turno> listar() {
        return turnoRepository.findAll();
    }

    @Override
    public Turno guardar(Turno turno) {
        return turnoRepository.save(turno);
    }

    @Override
    public Turno actualizar(Turno turno) {

        return turnoRepository.save(turno);
    }

    @Override
    public Optional<Turno> listarPorId(Integer id) {
        return turnoRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        turnoRepository.deleteById(id);
    }
}
