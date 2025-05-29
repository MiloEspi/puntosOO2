package ar.edu.unlp.info.oo1.O2Ej1;

import java.time.LocalDate;

public class Reserva {
	private int cantidadDias; 
	private LocalDate fecha;
	private AutoEnAlquiler auto;
	
	public double montoAPagar () {
		return cantidadDias * this.auto.getPrecioPorDia();
		
	}
	
	public double montoAReembolsar () {
		if (LocalDate.now().isBefore(fecha)) {
		return this.auto.precioAReembolsar(fecha, cantidadDias);
	} else return 0;
	}

	public Reserva(int cantidadDias, LocalDate fecha, AutoEnAlquiler auto) {
		super();
		this.cantidadDias = cantidadDias;
		this.fecha = fecha;
		this.auto = auto;
	}
	
}
