package ar.edu.unlp.info.oo2.Patrones8;


public abstract class Prenda {
	
	private double liquidez;
	
	public Prenda(double liquidez) {
		this.liquidez = liquidez;
	}

	public abstract double calcularValor();
	
	public double calcularValorPrendario() {
		return this.calcularValor() * this.liquidez;
	}

}