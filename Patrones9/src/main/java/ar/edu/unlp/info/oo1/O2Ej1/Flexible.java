package ar.edu.unlp.info.oo1.O2Ej1;

import java.time.LocalDate;

public class Flexible implements PoliticaCancelacion{


public Flexible() {
		super();
	}

public double calcularPrecio(LocalDate fecha, int cantDias, double precioDia) {
		return cantDias * precioDia;
		
}	
}