package com.api.deporte.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.api.deporte.model.MusculosTrabajados;

import java.util.List;
import java.util.Map;

@Data@Document(collection = "Ejercicios")
public class Ejercicio {

    @Id
    private String id;

    private String nombre;
    private String tipoDeEjercicio;
    private String nivelDificultad;
    private String parteDelCuerpo;
    private String equipo;
    private String objetivo;
    private Map<String, Map<String, Integer>> porcentajeDeActivacion;
    private List<String> erroresComunes;
    private List<String> instrucciones;
    private String gif;
    private MusculosTrabajados musculosTrabajados;

    public MusculosTrabajados getMusculosTrabajados() {
        return musculosTrabajados;
    }

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoDeEjercicio() {
		return tipoDeEjercicio;
	}

	public void setTipoDeEjercicio(String tipoDeEjercicio) {
		this.tipoDeEjercicio = tipoDeEjercicio;
	}

	public String getNivelDificultad() {
		return nivelDificultad;
	}

	public void setNivelDificultad(String nivelDificultad) {
		this.nivelDificultad = nivelDificultad;
	}

	public String getParteDelCuerpo() {
		return parteDelCuerpo;
	}

	public void setParteDelCuerpo(String parteDelCuerpo) {
		this.parteDelCuerpo = parteDelCuerpo;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public Map<String, Map<String, Integer>> getPorcentajeDeActivacion() {
		return porcentajeDeActivacion;
	}

	public void setPorcentajeDeActivacion(Map<String, Map<String, Integer>> porcentajeDeActivacion) {
		this.porcentajeDeActivacion = porcentajeDeActivacion;
	}

	public List<String> getErroresComunes() {
		return erroresComunes;
	}

	public void setErroresComunes(List<String> erroresComunes) {
		this.erroresComunes = erroresComunes;
	}

	public List<String> getInstrucciones() {
		return instrucciones;
	}

	public void setInstrucciones(List<String> instrucciones) {
		this.instrucciones = instrucciones;
	}

	public String getGif() {
		return gif;
	}

	public void setGif(String gif) {
		this.gif = gif;
	}

	public void setMusculosTrabajados(MusculosTrabajados musculosTrabajados) {
        this.musculosTrabajados = musculosTrabajados;
    }

}
