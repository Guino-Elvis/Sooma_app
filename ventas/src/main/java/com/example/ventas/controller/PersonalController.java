package com.example.ventas.controller;

import com.example.ventas.entity.Personal;
import com.example.ventas.service.PersonalService;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/personal")

public class PersonalController {

    @Autowired
    private PersonalService personalService;

    @GetMapping()
    public ResponseEntity<List<Personal>> list() {
        return ResponseEntity.ok().body(personalService.listar());
    }

  

    @PostMapping()
    public ResponseEntity<Personal> save(@RequestBody Personal personal) {
        return ResponseEntity.ok(personalService.guardar(personal));
    }

    @PutMapping()
    public ResponseEntity<Personal> update(@RequestBody Personal personal) {
        return ResponseEntity.ok(personalService.actualizar(personal));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Personal> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(personalService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        personalService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
