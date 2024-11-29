package com.example.ventas.service;


import java.util.List;
import java.util.Optional;

import com.example.ventas.entity.Trabajador;

public interface TrabajadorService {

    public List<Trabajador> listar();

    public Trabajador guardar(Trabajador trabajador);

    public Trabajador actualizar(Trabajador trabajador);

    public Optional<Trabajador> listarPorId(Integer id);

    public void eliminarPorId(Integer id);


}
