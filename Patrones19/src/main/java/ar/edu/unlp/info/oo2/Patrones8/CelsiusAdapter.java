package ar.edu.unlp.info.oo2.Patrones8;

import java.util.List;
import java.util.stream.Collectors;

public class CelsiusAdapter implements WeatherData {
	private HomeWeatherStation estacion;
	

	
	public CelsiusAdapter(HomeWeatherStation estacion) {
        this.estacion = estacion;
    }
	
	public double getTemperatura () {
		return this.convertirACelsius(estacion.getTemperatura());
	}
	
	public double convertirACelsius(double temp) {
		return ((temp -32) /1.8);
	}
	
	public double getPresion() {
		return this.estacion.getPresion();
	}
	public double getRadiacionSolar() {
		return this.estacion.getRadiacionSolar();
	}
	public List<Double> getTemperaturas (){
		return  this.estacion.getTemperaturas().stream().
				map(t -> this.convertirACelsius(t)).
				collect(Collectors.toList());
		
	} 
	
	public String displayData() {
	     return String.format("Temperatura C: %.0f; Presión atmosf: %.0f; Radiación solar: %.0f;",
	                this.getTemperatura(), this.getPresion(), this.getRadiacionSolar());
	}
}
