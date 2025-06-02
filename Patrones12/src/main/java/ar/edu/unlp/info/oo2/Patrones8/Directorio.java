package ar.edu.unlp.info.oo2.Patrones8;

import java.util.ArrayList;

public class Directorio extends Elemento {
	private ArrayList<FileSystem> componentes;
	
	
	public int tamanoTotalOcupado () {
		return this.componentes.stream().mapToInt(c -> c.tamanoTotalOcupado()).sum();
		
	}
	
	
	
	public Archivo archivoMasGrande() {
		return this.componentes.stream().map(c -> c.archivoMasGrande()).
				max((a1, a2) -> Integer.compare(a1.tamanoTotalOcupado(), a1.tamanoTotalOcupado())).
				orElse(null);
	}




	
	public Archivo archivoMasNuevo() {
		// TODO Auto-generated method stub
		return null;
	}




	
	public Elemento buscar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void agregarComponente(FileSystem unComponente) {
		this.componentes.add(unComponente);
	}
	
	public void eliminarComponente(FileSystem unComponente) {
		this.componentes.remove(unComponente);
	}
	
	public ArrayList<FileSystem> getComponentes() {
		return this.componentes;
	}




	



	
}
