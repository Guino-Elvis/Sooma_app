package com.example.ventas.controller;

import com.example.ventas.entity.Examen;
import com.example.ventas.service.ExamenService;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/examen")

public class ExamenController {

    @Autowired
    private ExamenService examenService;

    @GetMapping()
    public ResponseEntity<List<Examen>> list() {
        return ResponseEntity.ok().body(examenService.listar());
    }

  

    @PostMapping()
    public ResponseEntity<Examen> save(@RequestBody Examen examen) {
        return ResponseEntity.ok(examenService.guardar(examen));
    }

    @PutMapping()
    public ResponseEntity<Examen> update(@RequestBody Examen examen) {
        return ResponseEntity.ok(examenService.actualizar(examen));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Examen> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(examenService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        examenService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
