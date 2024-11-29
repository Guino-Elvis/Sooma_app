package com.example.ventas.service;


import java.util.List;
import java.util.Optional;

import com.example.ventas.entity.Personal;

public interface PersonalService {

    public List<Personal> listar();

    public Personal guardar(Personal personal);

    public Personal actualizar(Personal personal);

    public Optional<Personal> listarPorId(Integer id);

    public void eliminarPorId(Integer id);


}
