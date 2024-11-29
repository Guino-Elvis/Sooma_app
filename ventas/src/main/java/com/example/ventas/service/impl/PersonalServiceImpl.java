package com.example.ventas.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ventas.entity.Personal;
import com.example.ventas.repository.PersonalRepository;
import com.example.ventas.service.PersonalService;


@Service
public class PersonalServiceImpl implements PersonalService{
    
    @Autowired
    private PersonalRepository personalRepository;

    @Override
    public List<Personal> listar() {
        return personalRepository.findAll();
    }

    @Override
    public Personal guardar(Personal personal) {
        return personalRepository.save(personal);
    }

    @Override
    public Personal actualizar(Personal personal) {

        return personalRepository.save(personal);
    }

    @Override
    public Optional<Personal> listarPorId(Integer id) {
        return personalRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        personalRepository.deleteById(id);
    }
}
