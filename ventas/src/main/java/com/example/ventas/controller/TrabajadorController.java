package com.example.ventas.controller;

import com.example.ventas.entity.Trabajador;
import com.example.ventas.service.TrabajadorService;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/trabajador")

public class TrabajadorController {

    @Autowired
    private TrabajadorService trabajadorService;

    @GetMapping()
    public ResponseEntity<List<Trabajador>> list() {
        return ResponseEntity.ok().body(trabajadorService.listar());
    }

  

    @PostMapping()
    public ResponseEntity<Trabajador> save(@RequestBody Trabajador trabajador) {
        return ResponseEntity.ok(trabajadorService.guardar(trabajador));
    }

    @PutMapping()
    public ResponseEntity<Trabajador> update(@RequestBody Trabajador trabajador) {
        return ResponseEntity.ok(trabajadorService.actualizar(trabajador));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Trabajador> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(trabajadorService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        trabajadorService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
