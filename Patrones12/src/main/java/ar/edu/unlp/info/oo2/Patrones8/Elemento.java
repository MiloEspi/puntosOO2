package ar.edu.unlp.info.oo2.Patrones8;

import java.time.LocalDate;

public abstract class Elemento  {

		private String nombre; 
		private LocalDate fechaCreacion; 
		
		
		public Elemento (String nombre, LocalDate fechaCreacion) {
			this.nombre  = nombre; 
			this.fechaCreacion = fechaCreacion;
		}
		
		public abstract int getTamano () ;
		public abstract Archivo archivoMasGrande();
		public abstract Archivo archivoMasNuevo();
		public abstract Elemento buscar();
}
