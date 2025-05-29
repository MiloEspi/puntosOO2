package ar.edu.unlp.info.oo1.O2Ej1;

import java.util.ArrayList;

public class Usuario {

		private String nombre; 
		private ArrayList <AutoEnAlquiler> autosAlquilados;
		
		
		public Usuario(String nombre) {
			this.nombre = nombre;
			this.autosAlquilados = new ArrayList<>();
		}
		
		
}
