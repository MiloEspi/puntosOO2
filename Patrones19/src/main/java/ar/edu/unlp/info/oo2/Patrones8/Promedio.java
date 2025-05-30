package ar.edu.unlp.info.oo2.Patrones8;

public class Promedio extends DecoradorClima {
	
	public Promedio (WeatherData componente) {
		super(componente);
	}
	
	public double calcularPromedio() {
		double prom =  this.getTemperaturas().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
	
	return prom;
	}
	public String displayData () {
		return this.getComponent().displayData() + "Promedio:" + this.calcularPromedio();
	}
}
