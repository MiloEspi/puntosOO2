package ar.edu.unlp.info.oo2.Patrones8;

public class Hoja implements Topografia{
	private double proporcion;
	
	public Hoja (double prop) {
		this.proporcion = prop;
	}


	public double proporcion() {
		
		return proporcion;
	}
	
	

	public boolean esIgualMixta(Mixta t) {
		return false;
	}
	
	public boolean equals(Topografia t) {
		return t.proporcion()  == this.proporcion;
		
	}
	
}
