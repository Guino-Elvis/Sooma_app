package com.example.ventas.controller;

import com.example.ventas.entity.turno;
import com.example.ventas.service.turnoService;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/turno")

public class turnoController {

    @Autowired
    private turnoService turnoService;

    @GetMapping()
    public ResponseEntity<List<turno>> list() {
        return ResponseEntity.ok().body(turnoService.listar());
    }


    @PostMapping()
    public ResponseEntity<turno> save(@RequestBody turno turno) {
        return ResponseEntity.ok(turnoService.guardar(turno));
    }

    @PutMapping()
    public ResponseEntity<turno> update(@RequestBody turno turno) {
        return ResponseEntity.ok(turnoService.actualizar(turno));
    }

    @GetMapping("/{id}")
    public ResponseEntity<turno> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(turnoService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        turnoService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
