package ar.edu.unlp.info.oo2.Patrones8;

public class Max extends DecoradorClima {
	public Max (WeatherData componente) {
		super(componente);
	}
	
	
	public double calcularMax() {
		double maximo =  this.getTemperaturas().stream()
                .max((t1, t2) -> Double.compare(t1, t2))
                .orElse(0.0);
	
	return maximo;
	}
	public String displayData () {
		return this.getComponent().displayData() + "Maximo:" + this.calcularMax();
	}
	
}
