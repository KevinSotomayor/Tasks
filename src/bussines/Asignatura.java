package bussines;

import java.util.Map;

public class Asignatura {
	
	
	private String titulo;
	private Double creditos;
	private int dificultad;
	private boolean anual;

	private Map<Integer, Actividad> listaactividades;
	
	public Asignatura(String titulo, Double creditos, int dificultad, boolean anual) {
		this.titulo = titulo;
		this.creditos = creditos;
		this.dificultad = dificultad;
		this.anual = anual;
	}
	
	//constructor de prueba para lista en menu lateral
	public Asignatura(String titulo){
		this.titulo = titulo;
	}
	//borrar despues de su uso
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Double getCreditos() {
		return creditos;
	}
	public void setCreditos(Double creditos) {
		this.creditos = creditos;
	}
	public int getDificultad() {
		return dificultad;
	}
	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}
	public boolean isAnual() {
		return anual;
	}
	public void setAnual(boolean anual) {
		this.anual = anual;
	}
	
	
	//ToString de prueba, borrar despues de su uso.
	public String toString(){
		return "- "+titulo;
	}
	
}
