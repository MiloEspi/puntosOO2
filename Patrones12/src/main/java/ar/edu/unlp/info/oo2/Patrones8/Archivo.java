package ar.edu.unlp.info.oo2.Patrones8;

import java.time.LocalDate;

public class Archivo extends Elemento{

		private String nombre; 
		private LocalDate fechaCreacion; 
		private int tamano;

		public Archivo (String nombre, LocalDate fecha, int tamano) {
			super(nombre, fecha);
			this.tamano = tamano;
		}
		
		
		public int tamanoTotalOcupado () {
			return this.tamano;
		}



}
