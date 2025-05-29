package ar.edu.unlp.info.oo1.O2Ej1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Moderada  implements PoliticaCancelacion {
	public double calcularPrecio(LocalDate fecha, int cantDias, double precioDia) {
	 long semanas = ChronoUnit.WEEKS.between( LocalDate.now(), fecha);
	  if (semanas > 1) {
		  return cantDias * precioDia;
	  } else {
		  return (cantDias* precioDia) /2;
	  }
		}

	public Moderada() {
		super();
	}
		
		
	}

