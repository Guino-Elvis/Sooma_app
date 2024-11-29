package com.example.ventas.controller;

import com.example.ventas.entity.Turno;
import com.example.ventas.service.TurnoService;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/turno")

public class TurnoController {

    @Autowired
    private TurnoService turnoService;

    @GetMapping()
    public ResponseEntity<List<Turno>> list() {
        return ResponseEntity.ok().body(turnoService.listar());
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Turno>> buscar(
            @RequestParam(required = false) String ra_social,
            @RequestParam(required = false) String marca) {
        List<Turno> turnos = turnoService.buscar(ra_social, marca);
        return ResponseEntity.ok().body(turnos);
    }

    @PostMapping()
    public ResponseEntity<Turno> save(@RequestBody Turno turno) {
        return ResponseEntity.ok(turnoService.guardar(turno));
    }

    @PutMapping()
    public ResponseEntity<Turno> update(@RequestBody Turno turno) {
        return ResponseEntity.ok(turnoService.actualizar(turno));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Turno> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(turnoService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        turnoService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
