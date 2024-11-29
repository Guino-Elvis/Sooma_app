package com.example.ventas.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ventas.entity.Cargo;
import com.example.ventas.repository.CargoRepository;
import com.example.ventas.service.CargoService;


@Service
public class CargoServiceImpl implements CargoService{
    
    @Autowired
    private CargoRepository cargoRepository;

    @Override
    public List<Cargo> listar() {
        return cargoRepository.findAll();
    }

    @Override
    public Cargo guardar(Cargo cargo) {
        return cargoRepository.save(cargo);
    }

    @Override
    public Cargo actualizar(Cargo cargo) {

        return cargoRepository.save(cargo);
    }

    @Override
    public Optional<Cargo> listarPorId(Integer id) {
        return cargoRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        cargoRepository.deleteById(id);
    }
}
