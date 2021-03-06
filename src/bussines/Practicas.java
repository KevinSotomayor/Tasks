package bussines;

import java.time.LocalDateTime;

public class Practicas extends Actividad {

	private int id_practicas;
	private boolean grupal;
	private boolean recuperable;
	
	public Practicas(int id, int id_actividad,	Asignatura asignatura, String titulo, String descripcion, LocalDateTime fechafinalizacion,
			         int tiempoestimado, Double porcentaje, int prioridadusuario,int prioridadtotal ,boolean finalizada, boolean para_despues, boolean grupal, boolean recuperable ) {
		
		super(id_actividad,asignatura, titulo, descripcion, fechafinalizacion, tiempoestimado, porcentaje, prioridadusuario, prioridadtotal, finalizada, para_despues);
		this.id_practicas = id;	
		this.grupal = grupal;
		this.recuperable = recuperable;		
	
		
		}
	public Practicas(	Asignatura asignatura, String titulo, String descripcion, LocalDateTime fechafinalizacion,
	         int tiempoestimado, Double porcentaje, int prioridadusuario,boolean finalizada, boolean para_despues, boolean grupal, boolean recuperable ) {

		super(asignatura, titulo, descripcion, fechafinalizacion, tiempoestimado, porcentaje, prioridadusuario, finalizada, para_despues);
		this.grupal = grupal;
		this.recuperable = recuperable;
		setPrioridadTotal(this.establecerPrioridadTotal());

	}
		private int establecerPrioridadTotal(){
			int aux =getAsignatura().getDificultad()+getPrioridadUsuario()+getTiempoEstimado()+5;
			if(isGrupal())aux = aux-5;
			if(!isRecuperable())aux = aux+14;
			return aux;
		}
		
	
	public int getId_practicas() {
		return id_practicas;
	}
	
	public void setId_practicas(int id_practicas) {
		this.id_practicas = id_practicas;
	}

	public boolean isGrupal() {
		return grupal;
	}

	public void setGrupal(boolean grupal) {
		this.grupal = grupal;
	}

	public boolean isRecuperable() {
		return recuperable;
	}

	public void setRecuperable(boolean recuperable) {
		this.recuperable = recuperable;
	}

}
