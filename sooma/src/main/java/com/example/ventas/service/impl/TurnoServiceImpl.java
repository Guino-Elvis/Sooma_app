package com.example.ventas.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ventas.entity.turno;
import com.example.ventas.repository.turnoRepository;
import com.example.ventas.service.turnoService;


@Service
public class turnoServiceImpl implements turnoService{
    
    @Autowired
    private turnoRepository turnoRepository;

  

    @Override
    public List<turno> listar() {
        return turnoRepository.findAll();
    }

    @Override
    public turno guardar(turno turno) {
        return turnoRepository.save(turno);
    }

    @Override
    public turno actualizar(turno turno) {

        return turnoRepository.save(turno);
    }

    @Override
    public Optional<turno> listarPorId(Integer id) {
        return turnoRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        turnoRepository.deleteById(id);
    }
}
