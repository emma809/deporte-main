package com.api.deporte.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
import java.util.Map;

@Data
    public class Ejercicio {

    @Id
    private String id;

    private String nombre;
    private String tipoDeEjercicio;
    private String nivelDificultad;
    private String parteDelCuerpo;
    private String equipo;
    private String objetivo;
    
    // La activación EMG será un mapa anidado que guarda los porcentajes de activación
    private Map<String, Map<String, Integer>> porcentajeDeActivacion; 

    private List<String> erroresComunes;
    private List<String> instrucciones;
    private String gif;
    
    // Se mantiene la clase MusculosTrabajados
    private MusculosTrabajados musculosTrabajados;

    // Getters y Setters generados automáticamente por Lombok (@Data)
}
