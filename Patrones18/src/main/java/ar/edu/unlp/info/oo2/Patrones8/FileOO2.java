package ar.edu.unlp.info.oo2.Patrones8;

import java.time.LocalDate;

public class FileOO2 implements FileComponent {

	private String nombre; 
	private String extension; 
	private double tamano;
	private LocalDate fechaCreacion;
	private LocalDate fechaMod;
	private String permisos;
	
	
	
	
	public FileOO2(String nombre, String extension, double tamano, LocalDate fechaCreacion, LocalDate fechaMod,
			String permisos) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.tamano = tamano;
		this.fechaCreacion = fechaCreacion;
		this.fechaMod = fechaMod;
		this.permisos = permisos;
	}

	public String prettyPrint() {
		return " ";
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getExtension() {
		return extension;
	}
	public double getTamano() {
		return tamano;
	}
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public LocalDate getFechaMod() {
		return fechaMod;
	}
	public String getPermisos() {
		return permisos;
	}





}
