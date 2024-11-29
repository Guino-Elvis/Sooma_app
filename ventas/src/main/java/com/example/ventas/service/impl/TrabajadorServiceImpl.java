package com.example.ventas.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ventas.entity.Trabajador;
import com.example.ventas.repository.TrabajadorRepository;
import com.example.ventas.service.TrabajadorService;


@Service
public class TrabajadorServiceImpl implements TrabajadorService{
    
    @Autowired
    private TrabajadorRepository trabajadorRepository;

    @Override
    public List<Trabajador> listar() {
        return trabajadorRepository.findAll();
    }

    @Override
    public Trabajador guardar(Trabajador trabajador) {
        return trabajadorRepository.save(trabajador);
    }

    @Override
    public Trabajador actualizar(Trabajador trabajador) {

        return trabajadorRepository.save(trabajador);
    }

    @Override
    public Optional<Trabajador> listarPorId(Integer id) {
        return trabajadorRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        trabajadorRepository.deleteById(id);
    }
}
