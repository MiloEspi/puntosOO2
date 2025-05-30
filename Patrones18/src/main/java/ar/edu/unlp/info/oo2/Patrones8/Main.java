package ar.edu.unlp.info.oo2.Patrones8;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		FileComponent f1 = new FileOO2("Archivo1", "PDF", 20, LocalDate.of(2024, 5, 28), LocalDate.of(2024, 5, 30), "todo");
		Aspecto a1 = new Nombre(f1);
		
	}

}
