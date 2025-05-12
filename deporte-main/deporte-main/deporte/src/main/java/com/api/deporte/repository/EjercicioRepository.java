package com.api.deporte.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.api.deporte.model.Ejercicio;

public interface EjercicioRepository extends MongoRepository<Ejercicio, String> {
}
