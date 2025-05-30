package ar.edu.unlp.info.oo2.Patrones8;

public class Min extends DecoradorClima {

	public Min (WeatherData componente) {
		super(componente);
	}
	
	
	public double calcularMin() {
		double minimo = this.getTemperaturas().stream()
                .min((t1, t2) -> Double.compare(t1, t2))
                .orElse(0.0);
	
	return minimo;
	}
	public String displayData () {
		return this.getComponent().displayData() +  "Minimo:" + this.calcularMin();
	}
}
