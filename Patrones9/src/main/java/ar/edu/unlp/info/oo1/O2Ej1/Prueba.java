package ar.edu.unlp.info.oo1.O2Ej1;

import java.time.LocalDate;

public class Prueba {

	public static void main(String[] args) {
		Usuario u1 = new Usuario("Camilo" );
		AutoEnAlquiler a1 = new AutoEnAlquiler(20.0, 5, "Ford", new Flexible());
		Reserva r1 = new Reserva(5, LocalDate.of(2025,6,1), a1);
		a1.setPolitica(new Moderada());
		System.out.print(r1.montoAReembolsar());

	}
// Roles del Strategy: 
// PoliticaCancelacion = STRATEGY 
// Flexible-Moderada-Estricta = ConcreteStrategy 
// autoEnAlquiler = Context 
// Reserva = Client
	
	
}
