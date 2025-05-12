package com.api.deporte.controller;

import com.api.deporte.model.Ejercicio;
import com.api.deporte.repository.EjercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/ejercicios")
@CrossOrigin(origins = "*")
public class EjercicioController {

    @Autowired
    private EjercicioRepository ejercicioRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    // GET básico para /api/ejercicios
    @GetMapping
    public List<Ejercicio> getAll() {
        return ejercicioRepository.findAll();
    }

    // GET sin deserialización (documentos crudos desde Mongo)
    @GetMapping("/raw")
    public List<Map> rawData() {
        return mongoTemplate.findAll(Map.class, "Ejercicios");
    }

    // GET específico por ID
    @GetMapping("/{id}")
    public Ejercicio getById(@PathVariable String id) {
        return ejercicioRepository.findById(id).orElse(null);
    }

    // POST para crear un nuevo ejercicio
    @PostMapping
    public Ejercicio create(@RequestBody Ejercicio nuevoEjercicio) {
        return ejercicioRepository.save(nuevoEjercicio);
    }

    // DELETE por ID
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        ejercicioRepository.deleteById(id);
    }
}
