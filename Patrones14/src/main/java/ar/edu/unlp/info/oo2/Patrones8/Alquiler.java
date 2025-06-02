package ar.edu.unlp.info.oo2.Patrones8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler extends Prenda {

	private LocalDate comienzo;
	private LocalDate fin;
	private double costoMensual;
	
	public Alquiler(double liquidez, LocalDate comienzo, LocalDate fin, double costoMensual) {
		super(liquidez);
		this.comienzo = comienzo;
		this.fin = fin;
		this.costoMensual = costoMensual;
	}

	public double calcularValor() {
		long cantMesesRestantes = ChronoUnit.MONTHS.between(LocalDate.now(), fin);
		return cantMesesRestantes * this.costoMensual;
	}
	
}
