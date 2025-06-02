package ar.edu.unlp.info.oo2.Patrones8;

import java.time.LocalDate;
import java.util.ArrayList;

public class Presupuesto {

	 private ArrayList<Componente> componentes;
		private String Usuario ; 
	 private LocalDate fecha;
		
		public Presupuesto () {
			
		}
		
		public double calcularConsumo () {
			return this.componentes.stream().mapToDouble(c -> c.getConsumo()).sum();
			
		}
		
		public double calcularPrecio() {
			return this.componentes.stream().mapToDouble(c -> c.getPrecio()).sum();
			
		}
		
		
		public void setProcesador(Componente procesador) {
			this.componentes.add(procesador);
		}
		public void setRAM(Componente RAM) {
			this.componentes.add(RAM);
		}
		public void setDisco(Componente disco) {
			this.componentes.add(disco);
		}
		public void setTarjeta(Componente tarjeta) {
			this.componentes.add(tarjeta);
		}
		public void setGabinete(Componente gabinete) {
			this.componentes.add(gabinete);
		}
		
		public void setUsuario (String username) {
			this.Usuario = username;
		}
		
		
}
