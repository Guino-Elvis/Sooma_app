package com.example.ventas.controller;

import com.example.ventas.entity.Cargo;
import com.example.ventas.service.CargoService;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/cargo")

public class CargoController {

    @Autowired
    private CargoService cargoService;

    @GetMapping()
    public ResponseEntity<List<Cargo>> list() {
        return ResponseEntity.ok().body(cargoService.listar());
    }

  

    @PostMapping()
    public ResponseEntity<Cargo> save(@RequestBody Cargo cargo) {
        return ResponseEntity.ok(cargoService.guardar(cargo));
    }

    @PutMapping()
    public ResponseEntity<Cargo> update(@RequestBody Cargo cargo) {
        return ResponseEntity.ok(cargoService.actualizar(cargo));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cargo> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(cargoService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        cargoService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
