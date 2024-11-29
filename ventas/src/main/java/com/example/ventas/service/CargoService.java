package com.example.ventas.service;


import java.util.List;
import java.util.Optional;

import com.example.ventas.entity.Cargo;

public interface CargoService {

    public List<Cargo> listar();

    public Cargo guardar(Cargo cargo);

    public Cargo actualizar(Cargo cargo);

    public Optional<Cargo> listarPorId(Integer id);

    public void eliminarPorId(Integer id);


}
