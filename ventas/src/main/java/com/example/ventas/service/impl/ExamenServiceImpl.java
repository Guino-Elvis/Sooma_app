package com.example.ventas.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ventas.entity.Examen;
import com.example.ventas.repository.ExamenRepository;
import com.example.ventas.service.ExamenService;


@Service
public class ExamenServiceImpl implements ExamenService{
    
    @Autowired
    private ExamenRepository examenRepository;

    @Override
    public List<Examen> listar() {
        return examenRepository.findAll();
    }

    @Override
    public Examen guardar(Examen examen) {
        return examenRepository.save(examen);
    }

    @Override
    public Examen actualizar(Examen examen) {

        return examenRepository.save(examen);
    }

    @Override
    public Optional<Examen> listarPorId(Integer id) {
        return examenRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        examenRepository.deleteById(id);
    }
}
