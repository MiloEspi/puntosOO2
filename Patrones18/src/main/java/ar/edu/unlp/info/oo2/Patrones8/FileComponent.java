package ar.edu.unlp.info.oo2.Patrones8;

import java.time.LocalDate;

public interface FileComponent {

	public String prettyPrint();
	public String getNombre();
	public String getExtension();
	public double getTamano() ;
	public LocalDate getFechaCreacion() ;
	public LocalDate getFechaMod() ;
	public String getPermisos() ;
	
}
