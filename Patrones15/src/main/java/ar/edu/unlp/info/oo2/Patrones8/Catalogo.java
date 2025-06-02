package ar.edu.unlp.info.oo2.Patrones8;

import java.util.ArrayList;

public class Catalogo {
	private static ArrayList<Componente> componentes;


public static Componente getComponente(String unaDescripcion) {
	 Componente res = componentes.stream().filter(p -> p.getNombre().equals(unaDescripcion)).findFirst().orElse(null);
	 return res;
}

}
