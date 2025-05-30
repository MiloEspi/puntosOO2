package ar.edu.unlp.info.oo2.Patrones8;

import java.time.LocalDate;

public abstract class Aspecto implements FileComponent {
	private FileComponent componente;
	
	
	
	
	public Aspecto(FileComponent componente) {
		this.componente = componente;
	}




	public abstract String prettyPrint();
	
	
	protected FileComponent getComponente () {
		return this.componente;
	}
	public String getNombre() {
		return componente.getNombre();
	}
	public String getExtension() {
		return componente.getExtension();
	}
	public double getTamano() {
		return componente.getTamano();
	}
	public LocalDate getFechaCreacion() {
		return componente.getFechaCreacion();
	}
	public LocalDate getFechaMod() {
		return componente.getFechaMod();
	}
	public String getPermisos() {
		return componente.getPermisos();
	}
}
