package ar.edu.unlp.info.oo1.O2Ej1;

import java.time.LocalDate;

public class AutoEnAlquiler {
	private double precioPorDia;
	private int cantidadPlazas;
	private String marca; 
	private PoliticaCancelacion politica;
	
	
	
	
	public AutoEnAlquiler(double precioPorDia, int cantidadPlazas, String marca, PoliticaCancelacion politica) {
		this.precioPorDia = precioPorDia;
		this.cantidadPlazas = cantidadPlazas;
		this.marca = marca;
		this.politica = politica;
	}
	public void setPolitica (PoliticaCancelacion unaPolitica) {
		this.politica = unaPolitica;
	}
	public double getPrecioPorDia () {
		return this.precioPorDia;
	}
	
	public double precioAReembolsar (LocalDate fecha, int cantDias) {
		return this.politica.calcularPrecio (fecha,cantDias, this.precioPorDia);
	}
}
